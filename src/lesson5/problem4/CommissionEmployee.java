package lesson5.problem4;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double getPayment() {
        double commission = commissionRate/100;
        return grossSales * commission;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Gross Sales: %.2f\nCommision Rate: %.2f\n", grossSales, commissionRate);
    }
}
