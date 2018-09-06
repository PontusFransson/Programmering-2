package vecka36;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public static void oldestPerson(Person p1, Person p2) {

		if (p1.getAge() > p2.getAge()) {
			System.out.println(p1.getName());
		} else {
			System.out.println(p2.getName());
		}

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
