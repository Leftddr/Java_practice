package priority_queue_ex;

import java.util.PriorityQueue;

public class ex {

	static PriorityQueue<Student> getPriorityQueueOfStudents() {
	    PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

	    priorityQueue.offer(new Student("��ö��", 20));
	    priorityQueue.offer(new Student("�迵��", 100));
	    priorityQueue.offer(new Student("������", 66));
	    priorityQueue.offer(new Student("�̳���", 7));
	    priorityQueue.offer(new Student("����", 43));
	    priorityQueue.offer(new Student("�ȿ���", 100));

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
