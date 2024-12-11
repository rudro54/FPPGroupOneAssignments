package lessonEight.problem2;
import java.util.*;
class Statistics {
	// Computes the sum of all salaries polymorphically
	public static double computeSumOfSalaries(List<EmployeeData> employees) {
		double totalSalary = 0;
		for (EmployeeData employee : employees) {
			totalSalary += employee.getSalary(); // Polymorphic call
		}
		return totalSalary;
	}
}
