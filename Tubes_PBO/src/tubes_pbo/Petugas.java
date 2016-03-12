/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo;

/**
 *
 * @author Ivanarhea
 */
public class Petugas extends Orang{
	private String idPetugas;

	public Petugas(String idPetugas, String nama, String username, String password, String alamat){
            super(nama, username, password, alamat);
            this.idPetugas = idPetugas;
            this.idPetugas = idPetugas;
	}

	public String idPetugas(){
		return idPetugas;
	}

	public void setIdPetugas(String idPetugas){
		this.idPetugas = idPetugas;
	}
}
