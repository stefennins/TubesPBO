package tubespbo;

public class Petugas extends Orang{
	private String idPetugas;

	public Petugas(String idPetugas, String nama, String username, String password, String alamat){
            super(nama, username, password, alamat);
            this.idPetugas = idPetugas;
	}

	public String getIdPetugas(){
		return idPetugas;
	}

	public void setIdPetugas(String idPetugas){
		this.idPetugas = idPetugas;
	}
}
