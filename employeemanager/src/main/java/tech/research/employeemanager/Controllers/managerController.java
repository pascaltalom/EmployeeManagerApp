package tech.research.employeemanager.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.research.employeemanager.Models.managerModel;
import tech.research.employeemanager.services.ManagerService;

@RestController
@RequestMapping("/manager")
public class managerController {

    private final ManagerService managerservice;

    public managerController(ManagerService managerservice) {
        this.managerservice = managerservice;
    }

    // Function to fetch All managers
    @RequestMapping("/all")
    public ResponseEntity<List<managerModel>> getAllManagers(){
        List<managerModel>managers = managerservice.findAllManager();
        return new ResponseEntity<>(managers, HttpStatus.OK);
    }

    // Function to add a manager
    @RequestMapping("/add")
    public ResponseEntity<managerModel> addManager(@RequestBody managerModel model){
        managerModel newManager = managerservice.addManager(model);
        return new ResponseEntity<>(newManager, HttpStatus.CREATED);
    }

    // Function to update a manager
    @RequestMapping("/update")
    public ResponseEntity<managerModel> updateManager(@RequestBody managerModel model){
        managerModel updateManager = managerservice.updateManager(model);
        return new ResponseEntity<>(updateManager, HttpStatus.OK);
    }

    // Function to delete a manager by id
    @RequestMapping("/delete/{id}")
    public ResponseEntity<?> deleteManager(@PathVariable("id") Long id){
        managerservice.deleteManagerById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    // Function to find a manager by id
    @RequestMapping("/find/{id}")
    public ResponseEntity<?> findManagerById(@PathVariable("id") Long id){
        managerModel managemodel = managerservice.findManagerById(id);
        return new ResponseEntity<>(managemodel, HttpStatus.OK);
    }
}
