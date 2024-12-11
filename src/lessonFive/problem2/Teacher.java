package lessonFive.problem2;

final class Teacher implements EmployeeData {
	private String name;
	private double salary;
	private double bonus;

	public Teacher(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public double getSalary() {
		return salary + bonus;
	}

	@Override
	public String toString() {
		return "Teacher[name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
}
