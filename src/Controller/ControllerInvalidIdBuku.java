/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.InvalidIdBuku;
import View.TambahBukuPerpus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerInvalidIdBuku implements ActionListener {

    Perpustakaan model;
    InvalidIdBuku view;
    Perpustakaan p;
    
    public ControllerInvalidIdBuku(Perpustakaan model){
        this.model = model;
        view = new InvalidIdBuku();
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
    }
}