package abhi.java.insticator.empmgm.service;

import abhi.java.insticator.empmgm.model.Employee;

/**
 * Created by Abhishek on 9/15/2016.
 */
public interface EmpManagementSvc {

    Employee findEmployeeById(int employeeId);

    public int createNewEmployee(Employee emp);

}
