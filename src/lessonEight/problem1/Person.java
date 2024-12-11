package lessonEight.problem1;

class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getLast() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Person[" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ']';
	}
}