package practice.midterm;

import java.util.Arrays;

public class Person {
    //Instance variables
    private String firstName;
    private String lastName;
    private String city;
    private Contact[] contacts;

    //Default constructors
    public Person() {
        this(null, null, null, null);
    }
    //Invoking other constructor
    public Person(String firstName, String lastName) {
        this(firstName, lastName, null, null);
    }
    //Parameter constructor
    public Person(String firstName, String lastName, String city, Contact[] contacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.contacts = contacts;
    }

    //Setters and getters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Contact[] getContacts() {
        return contacts;
    }
    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    //Instance method
    public boolean hasContactType(ContactType type) {
        if(contacts == null) {
            return false;
        }
        for(Contact contact : contacts) {
            if(contact != null && contact.getType() == type) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "," + city + ", Total Contacts: " + contacts.length;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return person.firstName.equals(this.firstName) && person.lastName.equals(this.lastName);
    }
}
