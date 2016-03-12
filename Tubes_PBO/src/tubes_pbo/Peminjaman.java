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
public class Peminjaman {
    private String idPeminjaman;
    private Anggota peminjam;
    private Buku[] buku;
    private String tglPeminjaman;
    private int jumlahBuku;
    private int maxBuku;
    private Petugas petugas;
    
    public Peminjaman(String idPeminjaman, String tglPeminjaman, int maxBuku, Anggota peminjam, Petugas petugas) {
        buku = new Buku[maxBuku];
        this.idPeminjaman = idPeminjaman;
        this.tglPeminjaman = tglPeminjaman;
        this.maxBuku = maxBuku;
        this.jumlahBuku = 0;
        this.peminjam = peminjam;
        this.petugas = petugas;
    }
    ///menambahkan buku baru
    public void addBuku(Buku buku){
        if((getJumlahBuku()<getMaxBuku()) && (buku.isDipinjam() == false)){
            this.getBuku()[getJumlahBuku()] = buku;
            this.getBuku()[getJumlahBuku()].setDipinjam(true);
            setJumlahBuku(getJumlahBuku() + 1);
        } else if(buku.isDipinjam() == true){
            System.out.println("MAAF, Buku Sudah Dipinjam");
        } else {
            System.out.println("MAAF, Jumlah Buku Melewati Batas Maksimal Peminjaman");
        }
    } 
    ///mengurangi pinjaman buku
    public void removeBuku(String idBuku){
        boolean found = false;
        int x;
        for (int i=0; i<getJumlahBuku(); i++){
            if (idBuku == null ? getBuku()[i].getIdBuku == null : idBuku.equals(getBuku()[i].getIdBuku)){
                found = true; getBuku()[i]=null; break;
            }
        }
        if (!found){
            System.out.println("Buku yang anda cari tidak ketemu");
            }
    }

    /**
     * @return the idPeminjaman
     */
    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    /**
     * @param idPeminjaman the idPeminjaman to set
     */
    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
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

    /**
     * @return the buku
     */
    public Buku[] getBuku() {
        return buku;
    }

    /**
     * @param buku the buku to set
     */
    public void setBuku(Buku[] buku) {
        this.buku = buku;
    }

    /**
     * @return the tglPeminjaman
     */
    public String getTglPeminjaman() {
        return tglPeminjaman;
    }

    /**
     * @param tglPeminjaman the tglPeminjaman to set
     */
    public void setTglPeminjaman(String tglPeminjaman) {
        this.tglPeminjaman = tglPeminjaman;
    }

    /**
     * @return the jumlahBuku
     */
    public int getJumlahBuku() {
        return jumlahBuku;
    }

    /**
     * @param jumlahBuku the jumlahBuku to set
     */
    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    /**
     * @return the maxBuku
     */
    public int getMaxBuku() {
        return maxBuku;
    }

    /**
     * @param maxBuku the maxBuku to set
     */
    public void setMaxBuku(int maxBuku) {
        this.maxBuku = maxBuku;
    }

    /**
     * @return the petugas
     */
    public Petugas getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }
    
}
