package tech.research.employeemanager.Models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employeeModel implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false, updatable = false)
  private Long id;
  private String name;
  private String email;
  private String phone;
  private String jobTitle;
  private String imageUrl;
  @Column(nullable = false, updatable = false)
  private String employeeCode;

public employeeModel() {}

public employeeModel(String name, String email, String phone, String jobTitle, String imageUrl, String employeeCode) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.jobTitle = jobTitle;
    this.imageUrl = imageUrl;
    this.employeeCode = employeeCode;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public String getJobTitle() {
    return jobTitle;
}

public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
}

public String getImageUrl() {
    return imageUrl;
}

public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
}

public String getEmployeeCode() {
    return employeeCode;
}

public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
}

@Override
public String toString() {
    return "employeeModel [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", jobTitle="
            + jobTitle + ", imageUrl=" + imageUrl + "]";
}



  
    
}