/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.service;

import core.model.User;

/**
 *
 * @author nel
 */
public interface LoginServiceInterface {
    
    public User login(String login, String password);
}
