/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo;

import java.util.ArrayList;
/**
 *
 * @author Ivanarhea
 */
public class Anggota extends Orang {
    private String idAnggota;
    
    public Anggota(String idAnggota, String nama, String username, String password, String alamat){
        super(nama, alamat, username, password);
        this.idAnggota = id Anggota;
    }

    /**
     * @return the idAnggota
     */
    public String getIdAnggota() {
        return idAnggota;
    }

    /**
     * @param idAnggota the idAnggota to set
     */
    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }
    
}
