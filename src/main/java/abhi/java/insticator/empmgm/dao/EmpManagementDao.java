package abhi.java.insticator.empmgm.dao;

import abhi.java.insticator.empmgm.model.Employee;

/**
 * Created by Abhishek on 9/15/2016.
 */
public interface EmpManagementDao {

    public Employee findById(int id);

    public int createEmployee(Employee emp);
}
