/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import util.HibernateUtil;

/**
 *
 * @author asunawesker
 */
public class DaoEmployee implements IDaoGeneral<Employee>{
    
    Session session = HibernateUtil.getSession();

    @Override
    public void create(Employee pojo) {
        session.beginTransaction();
        session.save(pojo);
        session.getTransaction().commit();
    }

    @Override
    public void detele(Employee pojo) {
        session.beginTransaction();
        session.delete(pojo);
        session.getTransaction().commit();
    }

    @Override
    public Employee readOne(Employee pojo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> readAll() {
        Query query = session.createSQLQuery("SELECT * FROM employees").setResultTransformer(Transformers.aliasToBean(Employee.class));
        return (List<Employee>) query.list();
    }

    @Override
    public void update(Employee pojo) {
        session.beginTransaction();
        session.update(pojo);
        session.getTransaction().commit();
    }
    
}
