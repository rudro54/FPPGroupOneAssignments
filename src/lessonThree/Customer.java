package lessonThree;

public class Customer {

    private String firstName;
    private String lastName;
    private String socSecurityNumber;
    Address billingAddress;
    Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNumber = socSecurity;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocSecurity() {
        return socSecurityNumber;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNumber + "]";
    }


}
