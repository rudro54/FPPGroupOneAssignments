package lessonThree;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;


    private static final int restingHeartRate = 70;
    private static final int maximumHeartRate = 220;
    private static final double lowerBoundary = 0.50;
    private static final double upperBoundary = 0.85;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

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

    public int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public int calculateMaxHeartRate() {
        return maximumHeartRate - calculateAge();
    }

  /*  public void calculateTargetBoundaryRange() {
        int maxHeartRate = calculateMaxHeartRate();
        int averageHeartRate = maxHeartRate - restingHeartRate;

        double lowerBoundaryTargetHeartRate = (averageHeartRate * lowerBoundary) + restingHeartRate;
        double upperBoundaryTargetHeartRate = (averageHeartRate * upperBoundary) + restingHeartRate;

        System.out.printf("Target Heart Rate Range :%.2f - %.2f bpm%n", lowerBoundaryTargetHeartRate, upperBoundaryTargetHeartRate);
    }*/




    public String toString() {
        return String.format("Name: %s %s%nDate of Birth: %s%nAge: %d years%nMaximum Heart Rate: %d bpm%n",
                firstName, lastName, dateOfBirth, calculateAge(), calculateMaxHeartRate());
    }


}


