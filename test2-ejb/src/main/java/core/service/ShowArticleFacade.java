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
public class ShowArticleFacade{

    @PersistenceContext
    private EntityManager entityManager;
    private ShowArticleService bo = new ShowArticleService();

    public List<Article> show() {
        bo.setEntityManager(entityManager);
        return bo.show();
    }
}