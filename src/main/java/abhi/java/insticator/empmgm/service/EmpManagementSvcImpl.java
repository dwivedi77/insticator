package abhi.java.insticator.empmgm.service;

import abhi.java.insticator.empmgm.dao.EmpManagementDao;
import abhi.java.insticator.empmgm.model.Employee;

import javax.inject.Inject;

/**
 * Created by Abhishek on 9/16/2016.
 */
public class EmpManagementSvcImpl implements EmpManagementSvc {
    public EmpManagementSvcImpl() {
    }

    @Inject
    private EmpManagementDao empManagementDao;

    @Override
    public Employee findEmployeeById(int employeeId) {
        Employee emp = empManagementDao.findById(employeeId);
        return emp;
    }

    @Override
    public int createNewEmployee(Employee emp) {
        int id = empManagementDao.createEmployee(emp);
        return id;
    }

    public EmpManagementDao getEmpManagementDao() {
        return empManagementDao;
    }

    public void setEmpManagementDao(EmpManagementDao empManagementDao) {
        this.empManagementDao = empManagementDao;
    }
}
