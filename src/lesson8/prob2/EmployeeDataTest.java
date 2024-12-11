package lesson8.prob2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataTest {

    @Test
    public void testStaffGetSalary() {
        Staff staff = new Staff("John", 110000, 2);
        assertEquals(110000, staff.getSalary());
    }

    @Test
    public void testTeacherGetSalary() {
        Teacher teacher = new Teacher("Andrew", 110000, 10000);
        assertEquals(120000, teacher.getSalary());
    }

    @Test
    public void testCombineLists() {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff("John", 110000, 2));
        staffList.add(new Staff("Tom", 90000, 3));

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Andrew", 110000, 10000));
        teacherList.add(new Teacher("Phil", 135000, 12000));

        List<EmployeeData> combinedList = Main.combine(staffList, teacherList);

        assertEquals(4, combinedList.size());
        assertTrue(combinedList.containsAll(staffList));
        assertTrue(combinedList.containsAll(teacherList));
    }

    @Test
    public void testCombineEmptyLists() {
        List<Staff> staffList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();

        List<EmployeeData> combinedList = Main.combine(staffList, teacherList);

        assertEquals(0, combinedList.size());
    }

    @Test
    public void testComputeSumOfSalaries() {
        List<EmployeeData> employeeList = new ArrayList<>();
        employeeList.add(new Staff("John", 110000, 2));
        employeeList.add(new Staff("Tom", 90000, 3));
        employeeList.add(new Teacher("Andrew", 110000, 10000));
        employeeList.add(new Teacher("Phil", 135000, 12000));

        double sum = Statistics.computeSumOfSalaries(employeeList);
        assertEquals(467000, sum);
    }

    @Test
    public void testComputeSumOfSalariesEmptyList() {
        List<EmployeeData> employeeList = new ArrayList<>();

        double sum = Statistics.computeSumOfSalaries(employeeList);
        assertEquals(0, sum);
    }

    @Test
    public void testStaffToString() {
        Staff staff = new Staff("John", 110000, 2);
        assertEquals("John 110000.0", staff.toString());
    }

    @Test
    public void testTeacherToString() {
        Teacher teacher = new Teacher("Andrew", 110000, 10000);
        assertEquals("Andrew 120000.0", teacher.toString());
    }
}

