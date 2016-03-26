package tubespbo;

import java.util.ArrayList;

public class Anggota extends Orang {
	private String idAnggota;

	public Anggota(String idAnggota, String nama, String username, String password, String alamat){
		super(nama, alamat, username, password);
                this.idAnggota = idAnggota;
	}
        
        public String getIdAnggota(){
            return idAnggota;
        }
        
        public void setIdAnggota(String idAnggota){
            this.idAnggota = idAnggota;
        }
}
