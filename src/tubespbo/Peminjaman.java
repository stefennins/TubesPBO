/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.*;

public class Peminjaman{
    private String idPeminjaman;
    private Anggota peminjam;
    private String tglPeminjaman;
    //private boolean statusPinjam;
    private int jumlahBuku;
    private int maxBuku;
    private Petugas petugas;
    
    public Peminjaman(String idPeminjaman, String tglPeminjaman, int maxBuku, Anggota peminjam, Petugas petugas) {
        this.idPeminjaman = idPeminjaman;
        this.tglPeminjaman = tglPeminjaman;
        this.maxBuku = maxBuku;
        this.jumlahBuku = 0;
        this.peminjam = peminjam;
        this.petugas = petugas;
    }
    
    public Peminjaman(Anggota peminjam, String tglPeminjaman, int jumlahBuku) {
        this.peminjam = peminjam;
        this.tglPeminjaman = tglPeminjaman;
        this.jumlahBuku = jumlahBuku;
    }
    
//    public void addBuku(Buku buku){
//        if((jumlahBuku<maxBuku) && (buku.isDipinjam() == false)){
//            buku.setDipinjam(true);
//            jumlahBuku++;
//        } else if(buku.isDipinjam() == true){
//            System.out.println("ERROR : Buku Sudah Dipinjam");
//        } else {
//            System.out.println("ERROR : Jumlah Buku Melewati Batas Maksimal");
//        }
//    }      

    /**
     * @return the buku
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
    
    @Override
    public String toString(){
        String tmp = "";
        /*for(Buku b : buku){
            tmp+="Buku "+b.getJudul()+"\n";
        }*/
        return tmp;
    }
}

