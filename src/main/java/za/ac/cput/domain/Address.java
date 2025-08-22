package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private String addressId;
    private String streetNumber;
    private String city;
    private String province;
    private String country;
    private short postalCode;

    protected Address() {
    }

    public Address(String addressId, String streetNumber, String city, String province, String country, short postalCode) {
        this.addressId = addressId;
        this.streetNumber = streetNumber;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public short getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(short postalCode) {
        this.postalCode = postalCode;
    }

@Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}//end
