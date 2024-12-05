package lessonFive.Problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        DeptEmployee[] departments = new DeptEmployee[5];
        departments[0] = new Professor("Dr. Riaz Mollah", LocalDate.of(2005, 3, 15), 120000, 15);
        departments[1] = new Professor("Dr. Zashim Uddin", LocalDate.of(2010, 4, 15), 110000, 10);
        departments[2] = new Professor("Dr. Zenith Lott", LocalDate.of(2015, 7, 15), 100000, 8);
        departments[3] = new Secretary("Mr. Opu Mollah", LocalDate.of(2018, 2, 5), 6000, 10);
        departments[4] = new Secretary("Mr. Amin Mir", LocalDate.of(2020, 7, 10), 5000, 5);


        for(DeptEmployee employee:departments){
            System.out.println(employee);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Do You Want To See The Sum Of All Salaries ? [Y/N] ");
        String response = sc.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            double result = computeSalaries(departments);
            System.out.println("Total Salary Of The Department :" + String.format("%.2f", result));

            double averageSalary = result / departments.length;
            System.out.println("Total Average Salary :" + String.format("%.2f", averageSalary));

        } else {
            System.out.println("Getting Out By Doing Nothing");
            sc.close();
        }

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








