package abhi.java.insticator.empmgm.controller;

import abhi.java.insticator.empmgm.model.Employee;
import abhi.java.insticator.empmgm.service.EmpManagementSvc;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

/**
 * Created by Abhishek on 9/15/2016.
 */
@RestController
public class EmpManagementController {

    @Inject
    private EmpManagementSvc empManagementSvc;

    @RequestMapping(value = "employee/{employeeId}/", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.ALL_VALUE}, method = RequestMethod.GET)
    @ResponseBody
    public Employee findEmployeeById(@PathVariable(value = "employeeId") int employeeId){
        Employee emp = empManagementSvc.findEmployeeById(employeeId);
        return emp;
    }

    @RequestMapping(value = "employee/new", consumes = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.PUT)
    @ResponseBody
    public int createEmployee(@RequestBody Employee emp){
        int id = empManagementSvc.createNewEmployee(emp);
        return id;
    }

    public EmpManagementSvc getEmpManagementSvc() {
        return empManagementSvc;
    }

    public void setEmpManagementSvc(EmpManagementSvc empManagementSvc) {
        this.empManagementSvc = empManagementSvc;
    }
}
