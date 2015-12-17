/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.presentation.controller;

import core.model.Article;
import core.model.User;
import core.service.LoginFacade;
import core.service.ShowArticleFacade;
import java.io.Serializable;
import java.util.List;
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
public class ShowArticleController implements Serializable{
    
    @EJB
    private ShowArticleFacade Services;
    
        private ShowArticleModel Model = new ShowArticleModel();
    
     // getter and setter 
    
        
        public ShowArticleFacade getServices() {
        return Services;
    }

    public void setServices(ShowArticleFacade Services) {
        this.Services = Services;
    }
    public ShowArticleModel getModel() {
        return Model;
    }

    public void setModel(ShowArticleModel Model) {
        this.Model = Model;
    }
    

    
     public String loginUser() {
        try {
            List<Article> art = Services.show();
//              getModel().setArtName(art.getArticleName());
//              getModel().setArtDesc(art.getDescription());
              return "welcome.xhtml";

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Bad Credential."));
            return null;
        }
    }

    
    
    
   

    
    
    //LoginModel Class
    public static class ShowArticleModel implements Serializable {

        private String artName;
        private String artDesc;

        public String getArtName() {
            return artName;
        }

        public void setArtName(String artName) {
            this.artName = artName;
        }

        public String getArtDesc() {
            return artDesc;
        }

        public void setArtDesc(String artDesc) {
            this.artDesc = artDesc;
        }

        

    }
}
