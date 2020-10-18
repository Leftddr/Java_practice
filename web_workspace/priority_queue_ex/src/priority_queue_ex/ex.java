package priority_queue_ex;

import java.util.PriorityQueue;

public class ex {

	static PriorityQueue<Student> getPriorityQueueOfStudents() {
	    PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

	    priorityQueue.offer(new Student("±èÃ¶¼ö", 20));
	    priorityQueue.offer(new Student("±è¿µÈñ", 100));
	    priorityQueue.offer(new Student("ÇÑÅÃÈñ", 66));
	    priorityQueue.offer(new Student("ÀÌ³ª¿µ", 7));
	    priorityQueue.offer(new Student("ÀÌÇõ", 43));
	    priorityQueue.offer(new Student("¾È¿µÈñ", 100));

	    return priorityQueue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> priorityQueue = getPriorityQueueOfStudents();
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
		
	}

}
