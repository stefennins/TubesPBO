/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anggota;
import Model.Perpustakaan;
import View.LoginPetugas;
import View.TambahPinjaman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerTambahPinj implements ActionListener {

    Perpustakaan model;
    TambahPinjaman view;
    Perpustakaan p;
    
    public ControllerTambahPinj(Perpustakaan model){
        this.model = model;
        view = new TambahPinjaman();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();

        if (source.equals(view.getButtonMenuPetugas())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
        
        else if(source.equals(view.getButtonNext())){
            String id = view.getIdAnggota().getText();
            Anggota anggota = null;
            for(Anggota a : model.getArrayAnggota()) {
            if(a.getIdAnggota() == Integer.parseInt(id)){
                anggota = a;;
            }
            
     
            }
            
        
    }    
}
    
}
