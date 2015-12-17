/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.presentation.model;

import core.model.User;
import core.presentation.controller.SessionController;
import core.service.LoginService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
//import core.model.User;
/**
 *
 * @author nel
 */
//@ManagedBean
//@SessionScoped
public class LoginController2 implements Serializable {
//    private User user=new User();
//    @EJB
//    LoginService loginService;
// 
//    @ManagedProperty("#{sessionController}")
//    private SessionController session;
//
//    public LoginModel getModel() {
//        return model;
//    }
//    private LoginModel model = new LoginModel();
//
//
//    public LoginService getService() {
//        return loginService;
//    }
//
//  
//
//    public String login() {
//        try {
//            User u = loginService.login(getModel().getLogin(), getModel().getPassword());
//            session.getModel().setUser(u);
//            return "/pages/firstPage";
//        } catch (Exception e) {
//       
//            return "/pages/Error";
//        }
//    }
//
//    public SessionController getSession() {
//        return session;
//    }
//
//    public void setSession(SessionController session) {
//        this.session = session;
//    }
//
// 
//
//    public void setLoginService(LoginService coreService) {
//        this.loginService = coreService;
//    }
//
//    public class LoginModel implements Serializable{
//        private String login;
//        private String password;
//
//        public String getLogin() {
//            return login;
//        }
//
//        public void setLogin(String login) {
//            this.login = login;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//        
//    }
    
    
    /*
    
    INSERT INTO PROJSEM.UTILISATEUR_TABLE 
(id,name,login,password)
VALUES (1,'admin','admin','admin');
    */
}
