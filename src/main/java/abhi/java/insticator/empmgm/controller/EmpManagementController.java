package abhi.java.insticator.empmgm.controller;

import abhi.java.insticator.empmgm.model.Employee;
import abhi.java.insticator.empmgm.service.EmpManagementSvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

/**
 * Created by Abhishek on 9/15/2016.
 */
@RestController
public class EmpManagementController {

    @Inject
    private EmpManagementSvc empManagementSvc;

    @RequestMapping(value = "employee/{employeeId}/", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Employee> findEmployeeById(@PathVariable(value = "employeeId") int employeeId){
        Employee emp = null;
        try {
            emp = empManagementSvc.findEmployeeById(employeeId);
        }catch (Exception ex){
            return new ResponseEntity<Employee>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }

    @RequestMapping(value = "employee/new", consumes = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<Integer> createEmployee(@RequestBody Employee emp){
        int id = -1;
        try {
            id = empManagementSvc.createNewEmployee(emp);
        }catch (Exception ex){
            return new ResponseEntity<Integer>(id, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Integer>(id, HttpStatus.OK);
    }

    public EmpManagementSvc getEmpManagementSvc() {
        return empManagementSvc;
    }

    public void setEmpManagementSvc(EmpManagementSvc empManagementSvc) {
        this.empManagementSvc = empManagementSvc;
    }
}
