package lessonThree;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    final static int RHR = 70;
    final static double LB = 0.5;
    final static double UB = 0.85;

    //Data and properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    //Constructors
    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //Methods and behaviours
    public Period calculateAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today);
    }

    public int calculateMHR() {
        int age = calculateAge().getYears();
        return 220-age;
    }

    public int calculateAHR() {
        return calculateMHR() - RHR;
    }

    public double calculateLBTHR() {
        return (calculateAHR() * LB) + RHR;
    }

    public double calculateUBTHR() {
        return (calculateAHR() * UB) + RHR;
    }

    public void targetHeartRateRange() {
        System.out.printf("Target Heart Rate Range is between %.2f and %.2f\n", calculateLBTHR(), calculateUBTHR());
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nDate of Birth: " + dateOfBirth + "\nMaximum Heart Rate: " + calculateMHR();
    }
}
