/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.LihatDaftarPinjama;
import View.LoginPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerLihatDaftarPeminjaman implements ActionListener {

    Perpustakaan model;
    LihatDaftarPinjama view;
    Perpustakaan p;
    
    public ControllerLihatDaftarPeminjaman(Perpustakaan model){
        this.model = model;
        view = new LihatDaftarPinjama();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();

        if (source.equals(view.ButtonMenuAnggota())) {
            new ControllerMenuAnggota(model);
            view.dispose();
        } 
        
    }    
}
