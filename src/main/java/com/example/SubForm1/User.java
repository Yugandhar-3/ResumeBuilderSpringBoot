package com.example.SubForm1;



//import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import javax.validation.constraints.*;

public class User {
    @NotEmpty(message = "Please enter your name")
    String name;

    @NotEmpty(message = "Please enter your surname")
    public String surname;


    public Date birthday;

    @NotEmpty(message = "Please, specify your gender")
    public String gender;

    public boolean married;

    @NotEmpty(message = "Please enter your address")
    public String address;

    @NotEmpty(message = "Please enter your country")
    public String country;

    @NotBlank(message = "Please enter your email")

    //@Email(message = "Invalid email")
    @NotBlank(message = "Please enter your email")
    public String email;

    @NotEmpty(message = "Please, enter your phone number")
   // @Pattern(regexp = "[0-9]+",message = "invalid phone number")
    public String phoneNumber;

    @NotEmpty(message = "Please, specify languages you know")
    public String languages;

    @NotEmpty(message = "Please, specify technical skills you know")
    public String technicalSkills;

    @NotEmpty(message = "Important! Please specify position you want to apply")
    public String position;
    public String interests;
    @NotEmpty(message = "Important! Please specify data about your experience.")
    public String workDone;
    @NotEmpty(message = "Important! Please specify data about your linkedin.")
    private String linkedinprof;
    @NotEmpty(message = "Important! Please specify data about your github.")
    private String githubprof;
    @NotEmpty(message = "Important! Please specify data about your coding.")
    private String codingprof;
    @NotEmpty(message = "Important! Please specify data about your clgname.")
    private String clgname;
    @NotEmpty(message = "Important! Please specify data about your specilization.")
    private String specialization;
    @NotEmpty(message = "Important! Please specify data about your place.")
    private String place;
    @NotEmpty(message = "Important! Please specify data about your year.")
    private String year;

    public String getClgname() {
        return clgname;
    }

    public void setClgname(String clgname) {
        this.clgname = clgname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLinkedinprof() {
        return linkedinprof;
    }

    public void setLinkedinprof(String linkedinprof) {
        this.linkedinprof = linkedinprof;
    }

    public String getGithubprof() {
        return githubprof;
    }

    public void setGithubprof(String githubprof) {
        this.githubprof = githubprof;
    }

    public String getCodingprof() {
        return codingprof;
    }

    public void setCodingprof(String codingprof) {
        this.codingprof = codingprof;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String employer) {
        this.interests = interests;
    }

    public String getWorkDone() {
        return workDone;
    }

    public void setWorkDone(String workDone) {
        this.workDone = workDone;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(String technicalSkills) {
        this.technicalSkills = technicalSkills;
    }
}
