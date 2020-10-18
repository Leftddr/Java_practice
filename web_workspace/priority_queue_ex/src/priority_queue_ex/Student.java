package priority_queue_ex;

public class Student implements Comparable<Student> {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student target) {
		return this.age <= target.age ? 1 : -1;
	}
	
	@Override
	public String toString() {
		return "name : " + name + ", age : " + age;
	}
}
