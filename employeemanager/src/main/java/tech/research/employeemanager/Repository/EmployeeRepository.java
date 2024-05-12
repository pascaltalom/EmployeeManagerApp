package tech.research.employeemanager.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.research.employeemanager.Models.employeeModel;

public interface EmployeeRepository extends JpaRepository<employeeModel, Long>{

    void deleteEmployeeById(Long id);

    Optional<employeeModel> findEmployeeById(Long id);

   
    
  
}
