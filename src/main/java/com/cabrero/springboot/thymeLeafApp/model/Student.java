package com.cabrero.springboot.thymeLeafApp.model;

import jakarta.validation.constraints.*;

import java.util.List;

public class Student {
    private String firstName;


    @NotNull(message = "message is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    private String country;
    private String codingLanguage;
    private List<String> preferredOS;


    @Min(value = 0, message = "Number of free passes must be positive")
    @Max(value = 10, message = "No more than 10 free passes")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/ digits")
    private String postalCode;

    public @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/ digits") String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/ digits") String postalCode) {
        this.postalCode = postalCode;
    }








    public List<String> getPreferredOS() {
        return preferredOS;
    }

    public void setPreferredOS(List<String> preferredOS) {
        this.preferredOS = preferredOS;
    }

    public String getCodingLanguage() {
        return codingLanguage;
    }

    public void setCodingLanguage(String codingLanguage) {
        this.codingLanguage = codingLanguage;
    }

    public Student() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(@Min(value = 0, message = "Number of free passes must be positive") @Max(value = 10, message = "No more than 10 free passes") int freePasses) {
        this.freePasses = freePasses;
    }






}


