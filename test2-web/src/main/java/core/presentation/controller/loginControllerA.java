/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.presentation.controller;

import core.model.User;
import core.service.LoginFacade;
import core.service.LoginServiceInterface;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author nel
 */
@ManagedBean
@SessionScoped
public class loginControllerA implements Serializable{
    
    @EJB
    private LoginFacade Services;
    
        private LoginModel Model = new LoginModel();
    
     // getter and setter 
    public LoginFacade getServices() {
        return Services;
    }

    public void setServices(LoginFacade Services) {
        this.Services = Services;
    }
    public LoginModel getModel() {
        return Model;
    }

    public void setModel(LoginModel Model) {
        this.Model = Model;
    }
    

    
     public String loginUser() {
        try {
            User user = Services.login(getModel().getLogin(), getModel().getPassword());
              getModel().setLogin(user.getLogin());
              getModel().setPassword(user.getPassword());
              return "welcome.xhtml";

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Bad Credential."));
            return null;
        }
    }

    
    
    
   

    
    
    //LoginModel Class
    public static class LoginModel implements Serializable {

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
