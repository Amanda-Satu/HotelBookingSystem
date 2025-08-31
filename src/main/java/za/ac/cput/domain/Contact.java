package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {

    @Id
    private String contactId;
    private String phoneNumber;
    private String email;
    private String EmergencyContact;

    protected Contact(){
    }

    public Contact(String contactId, String emergencyContact, String email, String phoneNumber) {
        this.contactId = contactId;
        EmergencyContact = emergencyContact;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmergencyContact() {
        return EmergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        EmergencyContact = emergencyContact;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", EmergencyContact='" + EmergencyContact + '\'' +
                '}';
    }
}//end
