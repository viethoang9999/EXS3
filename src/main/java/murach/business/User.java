package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String source;
    private String offers;
    private String emailOffers;
    private String contactMethod;

    public User() {}

    // Getter & Setter
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getOffers() {
        return offers;
    }
    public void setOffers(String offers) {
        this.offers = offers;
    }

    public String getEmailOffers() {
        return emailOffers;
    }
    public void setEmailOffers(String emailOffers) {
        this.emailOffers = emailOffers;
    }

    public String getContactMethod() {
        return contactMethod;
    }
    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}
