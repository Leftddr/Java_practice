import java.util.LinkedList;

public class ThreadManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceQueue queue=new ResourceQueue();
		Thread Producer=new Thread(new Producer(queue),"producer1");
		Thread Consumer1=new Thread(new Consumer(queue),"consumer1");
		Thread Consumer2=new Thread(new Consumer(queue),"consumer2");
		
		Producer.start();
		Consumer1.start();
		Consumer2.start();
	}
}

class ShutDownHook extends Thread{
	private Thread target;
	public void shutdown() {
		System.out.println(Thread.currentThread().getName()+" called shutdown");
	}

	public ShutDownHook(Thread target,String name) {
		//super(name);
		this.target=target;
	}
	public void run() {
		shutdown();
		try {
			target.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable{
	private ResourceQueue queue;
	public Producer(ResourceQueue queue) {
		this.queue=queue;
	}
	public void run() {
		Thread shutDownHook = new ShutDownHook(Thread.currentThread(),"ShutDown");
		Runtime.getRuntime().addShutdownHook(shutDownHook);
		for(int i=0;i<10000;i++) {
			queue.put(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

class Consumer implements Runnable{
	private ResourceQueue queue;
	public Consumer(ResourceQueue queue) {
		this.queue=queue;
	}
	public void run() {
		while(!Thread.interrupted()) {
			try {
				Integer res=(Integer)queue.pop();
				if(res!=null)
					System.out.println(Thread.currentThread().getName()+ " pop : "+res);
			}
			catch(InterruptedException e){
				e.printStackTrace();
				break;
			}
		}
	}
}

class ResourceQueue{
	private LinkedList<Object> jobs=new LinkedList<Object>();
	
	public synchronized void clear() {
		jobs.clear();
	}
	
	public synchronized Object pop() throws InterruptedException{
		Object o = null;
		if(!jobs.isEmpty())
			o = jobs.removeFirst();
		return o;
	}
	
	public synchronized void put(Object o) {
		jobs.addLast(o);
	}
	
}
