/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.MenuAnggota;
import View.MenuPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerMenuPetugas implements ActionListener {
    

    Perpustakaan model;
    MenuPetugas view;
    Perpustakaan p;
    
    public ControllerMenuPetugas(Perpustakaan model){
        this.model = model;
        view = new MenuPetugas();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        
         Object source = ae.getSource();

        if (source.equals(view.getButtonTambahkanPinjaman())) {
            new ControllerTambahPinj(model);
            view.dispose();
        } 
        
        if (source.equals(view.getButtonKembalikanBuku())) {
            new ControllerKembalikanBuku(model);
            view.dispose();
        }
        
        if (source.equals(view.getButtonUbahKondisi())) {
            
            view.dispose();
        }
        
        if (source.equals(view.getButtonTambahkanBukuPerpustakaan())) {
            new ControllerMenuPetugas(model);
            view.dispose();
        }
        
        if (source.equals(view.getButtonMainMenu())) {
            new ControllerMenuPetugas(model);
            view.dispose();
        }
        
    }{
    
}
    
    
}
