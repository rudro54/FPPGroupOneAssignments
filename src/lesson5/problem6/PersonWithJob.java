package lesson5.problem6;

public class PersonWithJob extends Person {
    private double salary;

    public PersonWithJob(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Person person) {
        if (!(person instanceof PersonWithJob)) {
            return false;
        }
        return getName().equals(person.getName()) && salary == ((PersonWithJob) person).salary;
    }

}
