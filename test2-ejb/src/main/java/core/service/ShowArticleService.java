/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service;

import core.model.Article;
import core.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nel
 */

public class ShowArticleService{
    @PersistenceContext
   private EntityManager entityManager;
      public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public List<Article> show(){
        
        List<Article> art = entityManager.createQuery("SELECT a FROM Article a ")
                .setMaxResults(10)
                .getResultList();
        if(art.isEmpty()){
            throw new SecurityException("there is no Articles yet");
        }
        else
            return art;
    }
}