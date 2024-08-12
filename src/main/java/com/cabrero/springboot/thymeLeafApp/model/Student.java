package com.cabrero.springboot.thymeLeafApp.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Student {
    private String firstName;


    @NotNull(message = "message is required")
    @Size(min = 1, message = "is required")
    private String lastName;


    private String country;
    private String codingLanguage;
    private List<String> preferredOS;

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
}
