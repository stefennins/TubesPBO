/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.AddPinjBerhasil;
import View.TambahBukuPerpus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerInputPerpustakaan implements ActionListener {

    Perpustakaan model;
    TambahBukuPerpus view;
    Perpustakaan p;
    
    public ControllerInputPerpustakaan(Perpustakaan model){
        this.model = model;
        view = new TambahBukuPerpus();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();
      if (source.equals(view.getButtonTambahkanKePerpustakaan())) {
          
           
            view.dispose();
      }
      
      if (source.equals(view.getMenuPetugas())) {
          
            new ControllerMenuPetugas(model);
            view.dispose();
      }
    }
}
