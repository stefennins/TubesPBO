/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.CekKondisiBuku;
import View.MenuAnggota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerMenuAnggota implements ActionListener {

    Perpustakaan model;
    MenuAnggota view;
    Perpustakaan p;
    
    public ControllerMenuAnggota(Perpustakaan model){
        this.model = model;
        view = new MenuAnggota();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         Object source = ae.getSource();

        if (source.equals(view.getButtonDaftarPeminjaman())) {
            new ControllerMenuAnggota(model);
            view.dispose();
        } 
        
        if (source.equals(view.getButtonLihatBuku())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
        
        if (source.equals(view.getButtonMainMenu())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
        
    }{
    
}
    
} 
