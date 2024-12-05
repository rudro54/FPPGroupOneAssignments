package lessonFive.Problem2;

import java.time.LocalDate;

public abstract class DeptEmployee {

    private String name;
    private LocalDate hireDate;
    protected double salary;

    public DeptEmployee(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public abstract double computeSalary();
}
