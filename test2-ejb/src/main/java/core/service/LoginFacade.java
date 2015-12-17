/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service;

import core.model.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nel
 */

    
    @Stateless
public class LoginFacade{

    @PersistenceContext
    private EntityManager entityManager;
    private LoginService bo = new LoginService();

    public User login(String login, String password) {
        bo.setEntityManager(entityManager);
        return bo.login(login, password);
    }
}
    
