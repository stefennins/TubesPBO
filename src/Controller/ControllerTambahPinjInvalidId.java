/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.TambahPinjInvalidId;
import View.TambahPinjaman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerTambahPinjInvalidId implements ActionListener {

    Perpustakaan model;
    TambahPinjInvalidId view;
    Perpustakaan p;
    
    public ControllerTambahPinjInvalidId(Perpustakaan model){
        this.model = model;
        view = new TambahPinjInvalidId();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();

        if (source.equals(view.getButtonMenuPetugas())) {
            new ControllerMenuPetugas(model);
            view.dispose();
        }
        
        if (source.equals(view.getButtonTryAgain())) {
            new ControllerTambahPinj(model);
            view.dispose();
        }
    }
    
}
    
        

