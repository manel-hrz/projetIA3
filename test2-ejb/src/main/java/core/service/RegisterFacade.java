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
public class RegisterFacade{

    @PersistenceContext
    private EntityManager entityManager;
    private final RegisterService rg = new RegisterService();

    public User register(String login, String password, String name) {
        rg.setEntityManager(entityManager);
        return rg.register(login, password, name);
    }
}
