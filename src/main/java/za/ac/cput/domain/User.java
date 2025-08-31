package za.ac.cput.domain;

//Amanda Satu (221094008)

import jakarta.persistence.*;



@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "addressId", nullable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name ="contactId", nullable = false)
    private Contact contact;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String role;

    protected User() {
    }

    private User(Builder builder){
        this.userId = builder.userId;
        this.address = builder.address;
        this.contact = builder.contact;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.password = builder.password;
        this.role = builder.role;
    }

    public Long getUserId() {
        return userId;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", address=" + (address != null ? address.getAddressId() : null) +
                ", contact=" + (contact != null ? contact.getContactId() : null) +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static class Builder {
        private Long userId;
        private Address address;
        private Contact contact;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String password;
        private String role;

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.address = user.address;
            this.contact = user.contact;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.email = user.email;
            this.phoneNumber = user.phoneNumber;
            this.password = user.password;
            this.role = user.role;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }



}//end
