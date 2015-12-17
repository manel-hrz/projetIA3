/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service;

import core.model.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nel
 */
 @Stateless
public class RegisterService  {
    
    
        @PersistenceContext
   private EntityManager entityManager;
      public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    public User register(String login, String password, String name){
   
        User usr=new User();        
        usr.setLogin(login);
        usr.setName(name);
        usr.setPassword(password);
        entityManager.persist(usr);

 
         return(usr);
    }
         
    
}
 
