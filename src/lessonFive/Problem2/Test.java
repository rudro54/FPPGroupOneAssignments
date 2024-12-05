package lessonFive.Problem2;
import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Professor profRiaz = new Professor("Dr. Riaz Mollah", 5000, LocalDate.of(2005, 3, 15), 15);
        Professor profZashim = new Professor("Dr. Zashim Uddin", 4000, LocalDate.of(2010, 4, 15), 10);
        Professor profZanith = new Professor("Dr. Zenith Lott", 3000, LocalDate.of(2015, 7, 15), 8);
        Secretary secOpu = new Secretary("Mr. Opu Mollah", 2000,LocalDate.of(2018, 2, 5), 10);
        Secretary secAmin = new Secretary("Mr. Amin Mir", 1000, LocalDate.of(2020, 7, 10), 5);

        DeptEmployee[] departments = new DeptEmployee[] {
                profRiaz, profZashim, profZanith, secOpu, secAmin
        };

        for(DeptEmployee employee:departments){
            System.out.println(employee);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Do You Want To See The Sum Of All Salaries ? [Y/N] ");
        String response = sc.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            double result = computeSalaries(departments);
            System.out.println("Total Salary Of The Department: " + String.format("%.2f", result));

            double averageSalary = result / departments.length;
            System.out.println("Average Salary Of The Department: " + String.format("%.2f", averageSalary));
        } else {
            System.out.println("Getting Out By Doing Nothing");
        }

        sc.close();
    }

    public static double computeSalaries(DeptEmployee[] collection) {
        double salary = 0.0;
        if (collection != null) {
            for (DeptEmployee employee : collection) {
                if (employee != null) {
                    salary += employee.computeSalary();
                }
            }
        }
        return salary;
    }
}








