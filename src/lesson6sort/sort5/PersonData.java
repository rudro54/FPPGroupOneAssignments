package lesson6sort.sort5;

import java.util.Arrays;
import java.util.Comparator;

/** Sort-5-Comparator using Anonymous Inner class & Lambda */
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
		// Anonymous Inner Class
		
		System.out.println(" Anonymous Inner class salary sort ");
		System.out.println(Arrays.toString(persons1));

		// Lambda Implementation of Functional Interface Comparator
		System.out.println("Reversed salary using Lambda");
		
	}	
	
}
