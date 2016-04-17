/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.DaftarAnggota;
import View.IdAnggota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerIdAnggota implements ActionListener {

    Perpustakaan model;
    IdAnggota view;
    Perpustakaan p;
    String id;
    
    public ControllerIdAnggota(Perpustakaan model, String id){
        this.model = model;
        view = new IdAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
        this.id = id;
        view.setIdMember1(id);
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