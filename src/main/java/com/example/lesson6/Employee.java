package com.example.lesson6;

public class Employee {

  private long id;
  private String firstName;
  private String lastName;
  private String socialSecurityNumber;
  private int dateOfBirth;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public int getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(int dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}
