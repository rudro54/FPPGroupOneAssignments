package lesson5.Problem2;
import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double overTimeHours;

    public Secretary(String name, double salary, LocalDate hireDate, double overTimeHours) {
        super(name, salary, hireDate);
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
