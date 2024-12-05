package lesson6.sort4;

import java.util.Comparator;

public class Person {
	private String fname;
	private String lname;
	private double salary;

	static class InnerSort implements Comparator<Person> {
		public int compare(Person o1, Person o2) {
			return Double.compare(o2.getSalary(), o1.getSalary());
		}
	}
	
	public Person(String n, String l, double salary) {
		fname = n;
		lname = l;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return fname + " " + lname + " " + salary;
	}
}
