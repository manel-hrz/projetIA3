/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.presentation.controller;

import core.model.User;
import core.service.LoginFacade;
import core.service.RegisterFacade;
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
public class RegisterController  implements Serializable{
    
    
        
    @EJB
    private RegisterFacade Services;
    
        private RegisterModel Model = new RegisterModel();
    
     // getter and setter 
    public RegisterFacade getServices() {
        return Services;
    }

    public void setServices(RegisterFacade Services) {
        this.Services = Services;
    }
    public RegisterModel getModel() {
        return Model;
    }

    public void setModel(RegisterModel Model) {
        this.Model = Model;
    }
    
        
     public String register() {
        try {
            User user = Services.register(getModel().getLogin(), getModel().getPassword(),getModel().getName());
              getModel().setLogin(user.getLogin());
              getModel().setPassword(user.getPassword());
              getModel().setName(user.getName());
              return "welcome.xhtml";

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Bad Credential."));
            return null;
        }
}
     
     
     public static class RegisterModel implements Serializable {

        private String login;
        private String password;
        private String Name;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

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
