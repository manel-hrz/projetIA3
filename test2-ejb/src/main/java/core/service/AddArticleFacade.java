
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service;

import core.model.Article;
import core.model.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nel
 */

   @Stateless
public class AddArticleFacade {

    @PersistenceContext
    private EntityManager entityManager;
    private final AddArticleService rg = new AddArticleService();

    public Article addArticle(String artName, String artDesc) {
        rg.setEntityManager(entityManager);
        return rg.addArticle(artName, artDesc);
    }
}
