package org.example.models;

public class Address {
    private String streetNumber;
    private String streetName;
    private String city;
    private String country;

    public Address(String streetNumber,
                   String streetName,
                   String city,
                   String county) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this. country = county;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    public String getStreetName(){
        return streetNumber;
    }
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    public String getStreetNumber() {
        return streetName;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry(){
        return country;
    }

    @Override
    public String toString() {
        return streetNumber + " " + streetName + ", " + city + ", " + country;
    }
}

