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
//@LocalBean
public class LoginService implements LoginServiceInterface{
    @PersistenceContext
   private EntityManager entityManager;
      public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public User login(String login, String password){
        initializeDB();
        List<User> usr = entityManager.createQuery("SELECT u FROM User u WHERE u.login=:login AND u.password=:password")
                .setParameter("login", login)
                .setParameter("password", password)
                .getResultList();
        if(usr.isEmpty()){
            throw new SecurityException("there is no users yet");
        }
        else
            return usr.get(0);
    }
    
       public void initializeDB() {
         List<User> users = entityManager.createQuery("Select a from User a")
                .getResultList();
        if (users.isEmpty()) {
            User u=new User();
            u.setLogin("admin");
            u.setPassword("admin");
            entityManager.persist(u);
        }
    }
     
  
}

