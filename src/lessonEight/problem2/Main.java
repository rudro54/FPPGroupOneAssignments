package lessonEight.problem2;

import java.util.*;
public class Main {
	/** Combines the lists that are populated here into a single list
	 *  and passes to computeSumOfSalaries
	 */
	public static void main(String[] args) {
		List<Staff> staff = new ArrayList<>();
		staff.add(new Staff("John", 110000, 2));
		staff.add(new Staff("Tom", 110000, 4));
		staff.add(new Staff("Edward", 120000, 1));
		staff.add(new Staff("Rich", 90000, 3));
		staff.add(new Staff("Kevin", 100000, 1));

		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Andrew", 110000, 10000));
		teachers.add(new Teacher("Rabelais", 130000, 5500));
		teachers.add(new Teacher("Phil", 135000, 12000));
		teachers.add(new Teacher("Tony", 95000, 8000));

		// Combine the lists
		List<EmployeeData> combined = combine(staff, teachers);

		// Compute the sum of salaries
		double salarySum = Statistics.computeSumOfSalaries(combined);
		System.out.println(salarySum);
	}

	// Combines two lists into one
	public static List<EmployeeData> combine(List<? extends EmployeeData> list1, List<? extends EmployeeData> list2) {
		List<EmployeeData> combined = new ArrayList<>();
		combined.addAll(list1);
		combined.addAll(list2);
		return combined;
	}
}
