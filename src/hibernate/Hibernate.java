/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import controller.DaoEmployee;
import model.Employee;

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
        employee.setFullname("Irais Aguirre");
        employee.setTelephone("2721670898");
        employee.setAddress("Norte 16");
        
        DaoEmployee crud = new DaoEmployee();
        crud.create(employee);
    }
    
}
