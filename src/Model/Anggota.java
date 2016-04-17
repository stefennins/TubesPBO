package Model;

import java.util.ArrayList;

public class Anggota extends Orang {
	private static int idAnggota;
        private int id;

	public Anggota(String nama, String username, String password, String alamat){
		super(nama, alamat, username, password);
                id = Anggota.idAnggota++;
	}
        
        public int getIdAnggota(){
            return id;
        }
        
        public void setIdAnggota(int idAnggota){
            this.id = idAnggota;
        }
}
