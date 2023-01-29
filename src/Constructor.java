
public class Constructor {

	public static void main(String[] args) {
		
		Person p = new Person("Abhi", 26);
		System.out.println(p.name);
		System.out.println(p.age);
		p.setAge(27);
		System.out.println(p.age);

	}
}

class Person
{
	String name;
	int age;
	
	public Person(String names, int ages)
	{
		this.name = names;
		this.age = ages;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public int getAge() {
		return this.age;
	}

}
