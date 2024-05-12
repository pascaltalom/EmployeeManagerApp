package tech.research.employeemanager.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Managers")
public class managerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String department;
    @Column(nullable = false, updatable = false)
    private String managerCode;

    public managerModel() {
    }

    public managerModel(String name, String email, String phone, String department, String managerCode) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.managerCode = managerCode;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getManagerCode() {
        return managerCode;
    }

    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode;
    }

    @Override
    public String toString() {
        return "managerModel [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", department="
                + department + "]";
    }
  
}
