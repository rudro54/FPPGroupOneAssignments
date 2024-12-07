package practice.midterm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Creating Contact objects
        Contact[] contacts1 = {
                new Contact("john.doe@example.com", "123-456-7890", ContactType.BUSINESS),
                new Contact("jane.doe@example.com", "987-654-3210", ContactType.PERSONAL)
        };
        Contact[] contacts2 = {
                new Contact("alice@example.com", "555-555-5555", ContactType.BUSINESS),
                new Contact("bob@example.com", "666-666-6666", ContactType.BUSINESS)
        };
        Contact[] contacts3 = {
                new Contact("charlie@example.com", "777-777-7777", ContactType.OFFICE)
        };

        // Creating an array of Person objects
        Person[] persons = {
                new Person("John", "Doe", "New York", contacts1),
                new Person("Alice", "Smith", "Los Angeles", contacts2),
                new Person("Charlie", "Brown", "Chicago", contacts3)
        };

        System.out.println(Arrays.toString(getPersonsWithContactType(persons, ContactType.BUSINESS)));
    }

    public static Person[] getPersonsWithContactType( Person[] persons, ContactType contactType ) {
        if ( persons == null || persons.length == 0 ) {
            return new Person[0];
        }
        List<Person> personsWithBusinessContacts = new ArrayList<Person>();
        for(Person person: persons) {
            if(person.hasBusinessContact()) {
                personsWithBusinessContacts.add(person);
            }
        }
        return personsWithBusinessContacts.toArray(new Person[personsWithBusinessContacts.size()]);
    }
}
