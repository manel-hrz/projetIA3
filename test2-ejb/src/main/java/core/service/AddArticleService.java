
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service;

import core.model.Article;
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
public class  AddArticleService  {
    
    
        @PersistenceContext
   private EntityManager entityManager;
      public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    public Article addArticle(String artName, String artDesc){
   
        Article art=new Article();        
        art.setArticleName(artName);
        art.setDescription(artDesc);
        
        entityManager.persist(art);

 
         return(art);
    }
         
    
}
 
