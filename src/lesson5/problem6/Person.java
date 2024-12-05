package lesson5.problem6;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Person person) {
        if (person == null) {
            return false;
        }
        return this.name.equals(person.name);
    }
}
