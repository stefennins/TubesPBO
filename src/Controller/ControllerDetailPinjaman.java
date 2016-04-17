/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.AddPinjIDAgg;
import View.DetailPinj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerDetailPinjaman implements ActionListener {

    Perpustakaan model;
    DetailPinj view;
    Perpustakaan p;
    
    public ControllerDetailPinjaman(Perpustakaan model){
        this.model = model;
        view = new DetailPinj();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();
      if (source.equals(view.getMainMenu())) {
            new ControllerMainMenu(model);
            view.dispose();
      }
    }
}
