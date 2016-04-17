/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anggota;
import Model.Perpustakaan;
import View.AddPinjIDAgg;
import View.TambahPinjInvalidId;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerAddPinjIDAgg implements ActionListener {

    Perpustakaan model;
    AddPinjIDAgg view;
    Perpustakaan p;
    
    public ControllerAddPinjIDAgg(Perpustakaan model){
        this.model = model;
        view = new AddPinjIDAgg();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
    
      Object source = ae.getSource();
      if (source.equals(view.getButtonNext())) {
          
            new ControllerAddPinjInputIdBuku(model);
            view.dispose();

        if (source.equals(view.getIdAnggota())) {
            new ControllerAddPinjIDAgg(model);
            view.dispose();
        }
        
        if (source.equals(view.getJumlahBukuPinjam1())) {
            new ControllerTambahPinj(model);
            view.dispose();
        }
        
        
        } else if (source.equals(view.getButtonCek())){
            Anggota anggota = null;
            for(Anggota a : model.getArrayAnggota()) {
                if(a.getIdAnggota() == Integer.parseInt(view.getIDAnggota1())){
                    anggota = a; break;
                 }
            }
            
            if(anggota != null){
                JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Anggota Tidak Ditemukan");
            } else {
                if(Integer.parseInt(view.getJumlahBukuPinjam1()) <= 6){
                    view.setEnableNext(true);
                } else {
                    JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Jumlah Buku Tidak Boleh lebih dari 6 ");
                }
                
            }
        }
    }
    
    public static void main(String[] args) {
        ControllerAddPinjIDAgg c = new ControllerAddPinjIDAgg(new Perpustakaan(""));
        
    }
}
