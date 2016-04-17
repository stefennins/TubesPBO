/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anggota;
import Model.Perpustakaan;
import View.DaftarAnggota;
import View.MainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adi Nugroho
 */
public class ControllerDaftarAnggota implements ActionListener {

    Perpustakaan model;
    DaftarAnggota view;
    Perpustakaan p;
    
    public ControllerDaftarAnggota(Perpustakaan model){
        this.model = model;
        view = new DaftarAnggota();
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
        
        else if(source.equals(view.getButtonRegister())){
            String nama = view.getNama1();
            String alamat = view.getAlamat1();
            String Uname = view.getUname1();
            String pass = view.getPassword1();
            Anggota a = new Anggota(nama, Uname, pass, alamat);
            model.tambahAnggota(a);
            new ControllerIdAnggota(model, a.getIdAnggota()+"");
            view.dispose();
            
        }
        
    }{
    
}
}
