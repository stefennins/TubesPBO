package tubespbo;

public class Buku{
    private String judul;
    private String idBuku;
    private String pengarang;
    private String kondisi;
    private boolean dipinjam;
    private Anggota peminjam;

    public Buku(String idBuku, String judul, String pengarang, String kondisi){
        this.judul = judul;
        this.idBuku = idBuku;
        this.pengarang = pengarang;
        this.kondisi = kondisi;
        this.dipinjam = false;
    }
    
    public Buku(){
        
    };

    public String getJudul(){
            return judul;
    }

    public void setJudul(String judul){
            this.judul = judul;
    }

    public String getIdBuku(){
            return idBuku;
    }

    public void setIdBuku(String idBuku){
            this.idBuku = idBuku;
    }

    public String getPengarang(){
            return pengarang;
    }

    public void setPengarang(String pengarang){
            this.pengarang = pengarang;
    }

    public String getKondisi(){
            return kondisi;
    }

    public void setKondisi(String kondisi){
            this.kondisi = kondisi;
            
    }

    /**
     * @return the dipinjam
     */
    public boolean isDipinjam() {
        return dipinjam;
    }

    /**
     * @param dipinjam the dipinjam to set
     */
    public void setDipinjam(boolean dipinjam) {
        if(dipinjam == true){
            System.out.println("Buku "+judul+" Dipinjam");
        } else {
            System.out.println("Buku "+judul+" Dikembalikan");
        }
        this.dipinjam = dipinjam;
    }

    /**
     * @return the peminjam
     */
    public Anggota getPeminjam() {
        return peminjam;
    }

    /**
     * @param peminjam the peminjam to set
     */
    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }
}
