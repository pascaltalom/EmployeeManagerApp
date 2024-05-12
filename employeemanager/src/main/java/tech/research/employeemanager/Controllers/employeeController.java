package tech.research.employeemanager.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.research.employeemanager.Models.employeeModel;
import tech.research.employeemanager.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class employeeController{
    private final EmployeeService empService;

    public employeeController(EmployeeService empService) {
        this.empService = empService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<employeeModel>> getAllEmployees(){
        List<employeeModel> employees = empService.fetchAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);      
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<employeeModel> getEmployeeById(@PathVariable("id") Long id){
        employeeModel employees = empService.findEmployeeById(id);
        return new ResponseEntity<>(employees, HttpStatus.OK);      
    }

    @PostMapping("/add")
    public ResponseEntity<employeeModel> addEmployee(@RequestBody employeeModel employee){
        employeeModel Newemployees = empService.addEmployee(employee);
        return new ResponseEntity<>(Newemployees, HttpStatus.CREATED);      
    }

    @PutMapping("/update")
    public ResponseEntity<employeeModel> updateEmployee(@RequestBody employeeModel employee){
        employeeModel Updateemployees = empService.updateEmployee(employee);
        return new ResponseEntity<>(Updateemployees, HttpStatus.OK);      
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        empService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);      
    }
    
}
