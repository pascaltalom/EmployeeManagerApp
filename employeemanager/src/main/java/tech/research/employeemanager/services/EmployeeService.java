package tech.research.employeemanager.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import tech.research.employeemanager.Exceptions.UserNotFoundException;
import tech.research.employeemanager.Models.employeeModel;
import tech.research.employeemanager.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    // Create an instance of the Repository class
    private final EmployeeRepository employeeRepo;

    // create a constructor
    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    // Function to Add an Employee
    public employeeModel addEmployee(employeeModel empModel){
        empModel.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(empModel);
    }

    // Function to fetch all Employee
    public List<employeeModel> fetchAllEmployee(){
        return employeeRepo.findAll();
    }

    // Function to fetch an Employee by Id
    public employeeModel findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("User with Id"+ id + "was Not Found"));
    }


    // Function to Delete an Employee by ID
    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }

    // Function to update an Employee
    public employeeModel updateEmployee(employeeModel empModel){
        return employeeRepo.save(empModel);
    }
 
}