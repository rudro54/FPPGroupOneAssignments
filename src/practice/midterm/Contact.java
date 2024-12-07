package practice.midterm;

public class Contact {
    private String email;
    private String phone;
    private ContactType type;

    public Contact(String email, String phone, ContactType type) {
        this.email = email;
        this.phone = phone;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public ContactType getType() {
        return type;
    }
    public void setType(ContactType type) {
        this.type = type;
    }
}
