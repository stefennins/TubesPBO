/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anggota;
import Model.Buku;
import Model.Perpustakaan;
import View.AddPinjIDAgg;
import View.AddPinjInputIDBuku;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerAddPinjInputIdBuku implements ActionListener {

    Perpustakaan model;
    AddPinjInputIDBuku view;
    Perpustakaan p;
    
    public ControllerAddPinjInputIdBuku(Perpustakaan model){
        this.model = model;
        view = new AddPinjInputIDBuku();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 
    

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();
      
      Buku buku = null;
      
      if (source.equals(view.getButtonMenuPetugas())) {
            new ControllerMenuPetugas(model);
            view.dispose();
            }
      
      for(Buku b : model.getArrayBuku()) {
                if(b.getIdBuku().equals(view.getIDBuku().getText())){
                    buku = b; break;
                 }
            }
      
                if (source.equals(view.getButtonNextIdBuku())) {
                    if(buku != null){
                        JPanel panel = new JPanel();
                        JOptionPane.showMessageDialog(panel, "ID Buku Tidak Ditemukan");
            }
        }
      
            
      
      
      
    }
}