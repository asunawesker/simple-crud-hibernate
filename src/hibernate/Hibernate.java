/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import controller.DaoEmployee;
import java.util.List;
import model.Employee;
import org.hibernate.transform.Transformers;

/**
 *
 * @author asunawesker
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFullname("Irais Aguirre");
        employee.setTelephone("2721670898");
        employee.setAddress("Norte 16");
        
        DaoEmployee crud = new DaoEmployee();
//        employee.setId(1);
//        crud.detele(employee);
//        employee.setAddress("Col. Emiliano Zapata");
        crud.update(employee);
        List<Employee> employees = crud.readAll();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFullname());       
        }
    }
    
}
