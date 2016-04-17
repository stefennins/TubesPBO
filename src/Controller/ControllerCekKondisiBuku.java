/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.CekKondisiBuku;
import View.MainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerCekKondisiBuku implements ActionListener {

    Perpustakaan model;
    CekKondisiBuku view;
    Perpustakaan p;
    
    public ControllerCekKondisiBuku(Perpustakaan model){
        this.model = model;
        view = new CekKondisiBuku();
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
        
    }{
    
}
    
}
