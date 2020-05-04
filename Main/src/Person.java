
public class Person {
	String name;
	int age;
	public Person(String n) {
		this.name = n;
	}
	void setAge(int a) throws NegativeAgeException{
		if(a<0) {
			throw new NegativeAgeException();
		}
		this.age = a;
	}
}
