package lesson6.sort3;

import java.util.Arrays;
import java.util.Comparator;

/**Sort-3-Comparator using Local Inner class */
public class PersonData {
	public static Person[] prepareData() {
		Person[] persons = 
			{new Person("Joe","Brown",4566.56), new Person("Bob","Roth",3455.23), 
			 new Person("Anne","Mary",6788.90), new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}
	public static void main(String[] args) {
		
		Person[] persons = prepareData();
		PersonData pd = new PersonData();

		System.out.println("Sorting by first name");
		System.out.println("Before sorting: " + Arrays.toString(persons));
		pd.sort(persons);
		System.out.println("After sorting: " + Arrays.toString(persons));
		
	}

	private void sort(Person[] persons) {
		if (persons == null || persons.length == 0) return;
		class PersonComparator implements Comparator<Person> {
			@Override
			public int compare(Person o1, Person o2) {
				return  o1.getFname().compareTo(o2.getFname());
			}
		}
		Arrays.sort(persons, new PersonComparator());
	}
	
}
