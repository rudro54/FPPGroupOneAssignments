package lessonFive.Problem4;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstname, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstname, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s\nGross Sales: %.2f; Commission Rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }
}
