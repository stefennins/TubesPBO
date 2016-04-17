/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.InvalidIdBuku;
import View.KembalikanBuku;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerKembalikanBuku implements ActionListener {

    Perpustakaan model;
    KembalikanBuku view;
    Perpustakaan p;
    
    public ControllerKembalikanBuku(Perpustakaan model){
        this.model = model;
        view = new KembalikanBuku();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();
      
          
            new ControllerMainMenu(model);
            view.dispose();
      }
    }

