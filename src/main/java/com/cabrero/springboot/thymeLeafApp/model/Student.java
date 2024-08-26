package com.cabrero.springboot.thymeLeafApp.model;

import com.cabrero.springboot.thymeLeafApp.validation.CourseCode;
import jakarta.validation.constraints.*;

import java.util.List;

public class Student {
    private String firstName;
    private String country;
    private String codingLanguage;
    private List<String> preferredOS;

    @CourseCode(value = "TOPS", message = "must start with TOPS")
    private String courseCode;


    @NotNull(message = " is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = " is required")
    @Min(value = 0, message = "Number of free passes must be positive")
    @Max(value = 10, message = "No more than 10 free passes")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/ digits")
    private String postalCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(@Min(value = 0, message = "Number of free passes must be positive") @Max(value = 10, message = "No more than 10 free passes") Integer freePasses) {
        this.freePasses = freePasses;
    }

    public @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/ digits") String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/ digits") String postalCode) {
        this.postalCode = postalCode;
    }


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}


