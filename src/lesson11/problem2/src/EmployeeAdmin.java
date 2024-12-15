package lesson11.problem2.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> employees = new ArrayList<>();
		for(String ssn : socSecNums) {
			if (table.containsKey(ssn)) {
				Employee employee = table.get(ssn);
				if (employee != null && employee.getSalary() > 80000) {
					employees.add(employee);
				}
			}
		}
		employees.sort((Employee e1, Employee e2) -> e1.getSsn().compareTo(e2.getSsn()));
		return employees;
	}
	
}
