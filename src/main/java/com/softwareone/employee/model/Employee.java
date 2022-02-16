package com.softwareone.employee.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.softwareone.employee.model.Skills;
import com.softwareone.employee.model.Language;
import java.util.Date;
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(nullable=false, updatable= false)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String location;
    private String aboutMe;
    private Date birthdate;
    private String jobTitle;
    private String department;


    @OneToMany(targetEntity = Skills.class, cascade = CascadeType.ALL)
    @JoinColumn(name="es_fk",referencedColumnName = "id")
    private List <Skills> skills ;

    @OneToMany(targetEntity = Language.class, cascade = CascadeType.ALL)
    @JoinColumn(name="eL_fk",referencedColumnName = "id")
    private List <Language> languages ;


    public Employee(){

    }

    public Employee(Long id, String firstName, String lastName, String email, String mobileNumber, String location, String aboutMe, Date birthdate, String jobTitle, String department, List<Skills> skills, List<Language> languages) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.location = location;
        this.aboutMe = aboutMe;
        this.birthdate = birthdate;
        this.jobTitle = jobTitle;
        this.department = department;
        this.skills = skills;
        this.languages = languages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", location='" + location + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", birthdate=" + birthdate +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                ", skills=" + skills +
                ", languages=" + languages +
                '}';
    }
}

