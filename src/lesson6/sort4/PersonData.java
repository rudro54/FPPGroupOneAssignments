package lesson6.sort4;

import java.util.Arrays;

/** Sort-4-Comparator using Static Inner class */
public class PersonData {
	public static Person[] prepareData() {
		Person[] persons = 
			{new Person("Joe","Brown",4566.56), new Person("Bob","Roth",3455.23), 
			 new Person("Anne","Mary",6788.90), new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}

	public static void main(String[] args) {
		Person[] persons1 = prepareData();
		System.out.println("Sorting by salary descending order");
		System.out.println("Before sorting: " + Arrays.toString(persons1));
		Arrays.sort(persons1, new Person.InnerSort());
		System.out.println("After sorting: " + Arrays.toString(persons1));
	}
	
}
