package abhi.java.insticator.empmgm.dao;

import abhi.java.insticator.empmgm.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Abhishek on 9/16/2016.
 */
public class EmpManagementDaoHBMImpl extends HibernateDaoSupport implements EmpManagementDao {
    public EmpManagementDaoHBMImpl(SessionFactory factory) {
        super();
        init(factory);
    }

    public void init(SessionFactory factory){
        super.setSessionFactory(factory);
    }

    @Override
    public Employee findById(int id) {
        return getHibernateTemplate().get(Employee.class, new Integer(id));
    }

    @Transactional
    @Override
    public int createEmployee(Employee emp) {
        getHibernateTemplate().persist(emp);
        return emp.getId();
    }
}
