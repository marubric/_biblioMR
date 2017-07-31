package io.github.oliviercailloux.y2017.bibliomr.modele;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrubrice
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person mary=new Person();
        
        mary.setName("Ma");
       
        
        //mary.setDate(new java.util.Date(15/05/1993));
     
        Configuration con=new Configuration().configure().addAnnotatedClass(Person.class);
        con.addAnnotatedClass(Expression.class);
        ServiceRegistry reg=(ServiceRegistry) new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf=con.buildSessionFactory((org.hibernate.service.ServiceRegistry) reg);
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
     
        session.save(mary);
        
        tx.commit();
    }
    
}
