package tech.research.employeemanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class hello {


    @RequestMapping("/hello")
    public String Hello(){
        return "Hello Pascal";
    }
    
}
