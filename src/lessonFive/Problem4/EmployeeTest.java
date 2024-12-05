package lessonFive.Problem4;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new SalariedEmployee("John", "Doe", "111-11-1111", 1000.00);
        employees[1] = new HourlyEmployee("Jane", "Smith", "222-22-2222", 20.00, 40);
        employees[2] = new CommissionEmployee("Alex", "Johnson", "333-33-3333", 10000, 0.05);
        employees[3] = new BasePlusCommissionEmployee("Emma", "Williams", "444-44-4444", 5000, 0.04, 300);
        employees[4] = new SalariedEmployee("Chris", "Brown", "555-55-5555", 1200.00);

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.printf("Earned: %.2f%n", employee.getPayment());
            System.out.println("-------------------");
        }

        Employee maxSalaryEmployee = findMaxSalary(employees);

        if (maxSalaryEmployee != null) {
            System.out.println("Employee with max salary");
            System.out.println(maxSalaryEmployee);
            System.out.printf("Max Salary which was more than everyone : %.2f%n", maxSalaryEmployee.getPayment());
        } else {
            System.out.println("No Employee with max salary found!!");
        }
    }

    public static Employee findMaxSalary(Employee[] collection) {

        if (collection == null || collection.length == 0) {
            return null;
        }
        Employee maxEmployee = null;
        double maxSalary = 0.0;

        for (Employee employee : collection) {
            if (employee != null && employee.getPayment() > maxSalary) {
                maxEmployee = employee;
                maxSalary = employee.getPayment();
            }
        }
        return maxEmployee;

    }
}
