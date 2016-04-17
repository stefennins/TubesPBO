/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.AddPinjBerhasil;
import View.AddPinjIDAgg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerAddPinjBerhasil implements ActionListener {

    Perpustakaan model;
    AddPinjBerhasil view;
    Perpustakaan p;
    
    public ControllerAddPinjBerhasil(Perpustakaan model){
        this.model = model;
        view = new AddPinjBerhasil();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();
      if (source.equals(view.getButtonLihatDetailPeminjaman())) {
          
            
            view.dispose();
      }
    }
}
