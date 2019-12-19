package com.example.employee.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 *Request handler class to create request url and http methods
 *
 * @RestController is used to create Restfull web services using spring mvc
 *
 */
@RestController
public class Controller {
// create instance of employee class
    @Autowired
private EmpService empService;
//    Logger logger = LoggerFactory.getLogger(Controller.class);
    @GetMapping( value = "/getallemployee" , produces = {MediaType.APPLICATION_JSON_VALUE})

//    method to return employee details
    public List<Employee> all(){
        return empService.getall();
//        logger.info("getall emp details");
    }

    @GetMapping(value = "/{employee}/getbyid" ,produces = {MediaType.APPLICATION_JSON_VALUE} )
    public Employee getbyid(@PathVariable String employee , @RequestParam(value= "page") int page, @RequestParam(value = "count") int count){
        return empService.getbyid(employee);
    }

@PostMapping("/{addemployee}/new employee")
 public void postEmployee(@RequestBody Employee employee ){
       empService.postEmployee(employee);
 }

}
