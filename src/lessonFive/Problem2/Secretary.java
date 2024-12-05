package lessonFive.Problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

    private double overTimeHours;

    public Secretary(String name, LocalDate hireDate, double salary, double overTimeHours) {
        super(name, hireDate, salary);
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    @Override
    public double computeSalary() {
        return salary + (12 * overTimeHours);
    }

    @Override
    public String toString() {
        return "Secretary: " + getName() + ", Hire Date: " + getHireDate() + ", Salary: " + salary + ", Overtime Hours: " + overTimeHours;
    }
}
