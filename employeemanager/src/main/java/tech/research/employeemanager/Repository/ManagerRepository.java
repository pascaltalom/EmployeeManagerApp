package tech.research.employeemanager.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.research.employeemanager.Models.managerModel;

public interface ManagerRepository extends JpaRepository<managerModel, Long>{

    void deleteManagerById(Long id);

    Optional<managerModel> findManagerByid(Long id);
    
}
