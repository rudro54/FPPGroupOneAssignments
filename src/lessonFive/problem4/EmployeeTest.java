package lessonFive.problem4;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new BasePlusCommissionEmployee("Jon", "Doe", "111-11-1111", 100, 10, 1000),
                new CommissionEmployee("Jon", "Rambo", "111-11-2222", 10000, 10),
                new HourlyEmployee("AB", "DE Viliers", "111-11-3333", 20, 100),
                new SalariedEmployee("Sudipto", "Roy", "555-11-2222", 1500),
                new SalariedEmployee("Zayed", "Abdullah", "555-11-7777", 1800),
        };

        System.out.println(findMaxSalary(employees));
    }

    public static Employee findMaxSalary (Employee[] col) {
        if (col == null || col.length == 0) {
            return null;
        }
        Employee maxEarner = col[0];
        for (Employee employee : col) {
            if (employee.getPayment() >= maxEarner.getPayment()) {
                maxEarner = employee;
            }
        }
        return maxEarner;
    }
}
