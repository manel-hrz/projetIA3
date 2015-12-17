/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.presentation.controller;

import core.model.Article;
import core.model.User;
import core.service.AddArticleFacade;
import core.service.LoginFacade;
import core.service.RegisterFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author nel
 */

@ManagedBean(name="AddArticleController")
@RequestScoped
public class AddArticleController  implements Serializable{
    
    
        
    @EJB
    private AddArticleFacade Services;
    
        private ArticleModel Model = new ArticleModel();
    
     // getter and setter 
    public AddArticleFacade getServices() {
        return Services;
    }

    public void setServices(AddArticleFacade Services) {
        this.Services = Services;
    }
    public ArticleModel getModel() {
        return Model;
    }

    public void setModel(ArticleModel Model) {
        this.Model = Model;
    }
    
        
     public String add() {
        try {
            Article art = Services.addArticle(getModel().getArtName(), getModel().getArtDesc());
              getModel().setArtName(art.getArticleName());
              getModel().setArtDesc(art.getDescription());
             
              return "/faces/index2.xhtml";

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Bad Credential."));
            return null;
        }
}
     
     
     public static class ArticleModel implements Serializable {

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

        private String artName;
        private String artDesc;
       

        

    }
     
}
