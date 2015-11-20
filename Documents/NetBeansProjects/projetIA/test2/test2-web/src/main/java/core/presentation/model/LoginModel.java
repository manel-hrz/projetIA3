/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.presentation.model;

import core.model.User;
import core.service.LoginService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import core.model.User;
/**
 *
 * @author nel
 */
@ManagedBean
@SessionScoped
public class LoginModel implements Serializable {
    private User user=new User();
    @EJB
    LoginService service;
    private Model model = new Model();

    public User getUser() {
        return user;
    }

    public LoginService getService() {
        return service;
    }

    public Model getModel() {
        return model;
    }
    
    public class Model implements Serializable{
        private String login;
        private String password;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        
    }
}
