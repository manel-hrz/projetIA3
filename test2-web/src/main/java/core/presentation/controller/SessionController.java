/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.presentation.controller;

import core.presentation.model.SessionModel;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author nel
 */
@SessionScoped
@Named
public class SessionController implements Serializable {

    private final SessionModel model = new SessionModel();

    public SessionModel getModel() {
        return model;
    }

    public boolean isAuthentificated() {
        return model.getUser() != null;
    }

    public String navigateTo(String s){
        return s;
    }
}
