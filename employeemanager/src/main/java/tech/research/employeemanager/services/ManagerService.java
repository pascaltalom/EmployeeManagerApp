package tech.research.employeemanager.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import tech.research.employeemanager.Exceptions.UserNotFoundException;
import tech.research.employeemanager.Models.managerModel;
import tech.research.employeemanager.Repository.ManagerRepository;

@Service
public class ManagerService {

    private final ManagerRepository managerRepo;

    public ManagerService(ManagerRepository managerRepo) {
        this.managerRepo = managerRepo;
    }

    // Function to Add a  manager
    public managerModel addManager(managerModel managemodel){
        managemodel.setManagerCode(UUID.randomUUID().toString());
        return managerRepo.save(managemodel);     
    }

    // Function to find a manager
    public List<managerModel> findAllManager(){
        return managerRepo.findAll();       
    }

    // Function to delete Manager
    public void deleteManagerById(Long id){
        managerRepo.deleteManagerById(id);
    }

    // Function Update Manager
    public managerModel updateManager(managerModel managemodel){
        return managerRepo.save(managemodel);
    }

    // Function to Find Manager By Id
    public managerModel findManagerById(Long Id){
        return managerRepo.findManagerByid(Id).orElseThrow(()->new UserNotFoundException("Manager with ID" +Id+ "Not Found"));
    }
    
}
