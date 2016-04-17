/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.InvalidLogin;
import View.MainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */

    public class ControllerInvalidLogin implements ActionListener {

    Perpustakaan model;
    InvalidLogin view;
    Perpustakaan p;
    
    public ControllerInvalidLogin(Perpustakaan model){
        this.model = model;
        view = new InvalidLogin();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();

        if (source.equals(view.getButtonMainMenu())) {
            new ControllerMainMenu(model);
            view.dispose();
        } 
    }
}
