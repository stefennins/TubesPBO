/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perpustakaan;
import View.MainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Adi Nugroho
 */
public class ControllerMainMenu implements ActionListener {

    Perpustakaan model;
    MainMenu view;
    Perpustakaan p;
    
    public ControllerMainMenu(Perpustakaan model){
        this.model = model;
        view = new MainMenu();
        view.setVisible(true);
        view.addListener(this);
        this.p = null;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
       Object source = e.getSource();

        if (source.equals(view.getButtonLoginAnggota())) {
            new ControllerLoginAnggota(model);
            view.dispose();
        } 
        
        else if(source.equals(view.getButtonDaftarAnggota())){
            new ControllerDaftarAnggota(model);
            view.dispose();
        }
        
        else if (source.equals(view.getButtonLoginPetugas())){
             new ControllerLoginPetugas(model);
             view.dispose();
        }
        
        else if (source.equals(view.getButtonCekKondisiBuku())){
            new ControllerCekKondisiBuku(model);
            view.dispose();

}
    
    }
    
    public static void main(String[] args){
        ControllerMainMenu mn = new ControllerMainMenu(new Perpustakaan("a"));
    }
    
    
}