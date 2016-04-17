/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anggota;
import Model.Perpustakaan;
import View.LoginAnggota;
import View.MainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */

public class ControllerLoginAnggota implements ActionListener {

    Perpustakaan model;
    LoginAnggota view;
    Perpustakaan p;
    
    public ControllerLoginAnggota(Perpustakaan model){
        this.model = model;
        view = new LoginAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(view.getButtonBackMenuLoginAgg())) {
            new ControllerMainMenu(model);
            view.dispose();
        } else if(source.equals(view.getButtonLoginAgg())){
            String user = view.getUsernameLoginAgg1();
            String pass = view.getPasswordLoginAgg1();
            boolean kondisi = model.cekStatus(user, pass);
            if(kondisi){
                Anggota angota = model.getAnggotaUsername(user);
                new ControllerMenuAnggota(model);
            } else {
                new ControllerInvalidLogin(model); 
            }
        }
        
        
    }
    
}

