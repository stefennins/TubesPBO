/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo;

import.java.util.ArrayList;
/**
 *
 * @author Ivanarhea
 */
public class Perpustakaan {
    private String nama;
    private ArrayList<Buku> arrayBuku;
    private ArrayList<Anggota> arrayAnggota;
    private ArrayList<Petugas> arrayPetugas;
    private ArrayList<Peminjaman> arrayPeminjaman;
    
    public Perpustakaan(String nama){
        this.nama = nama;
        this.arrayAnggota = new ArrayList<>();
        this.arrayBuku = new ArrayList<>();
        this.arrayPeminjaman = new ArrayList<>();
        this.arrayPetugas = new ArrayList<>();
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    ///menambah anggota baru
    public void addAnggota(Anggota anggota){
        arrayAnggota.add(anggota);
    }
    ///menambah buku ke perpustakaan
    public void tambahBuku(Buku buku){
        arrayBuku.add(buku);
    }

    /**
     * @return the arrayBuku
     */
    public ArrayList<Buku> getArrayBuku() {
        return arrayBuku;
    }

    /**
     * @param arrayBuku the arrayBuku to set
     */
    public void setArrayBuku(ArrayList<Buku> arrayBuku) {
        this.arrayBuku = arrayBuku;
    }
    
    public void tambahAnggota(Anggota anggota){
        arrayAnggota.add(anggota);
    }
    
    /**
     * @return the arrayAnggota
     */
    public ArrayList<Anggota> getArrayAnggota() {
        return arrayAnggota;
    }

    /**
     * @param arrayAnggota the arrayAnggota to set
     */
    public void setArrayAnggota(ArrayList<Anggota> arrayAnggota) {
        this.arrayAnggota = arrayAnggota;
    }
    
    public void tambahPetugas(Petugas petugas){
        arrayPetugas.add(petugas);
    }

    /**
     * @return the arrayPetugas
     */
    public ArrayList<Petugas> getArrayPetugas() {
        return arrayPetugas;
    }

    /**
     * @param arrayPetugas the arrayPetugas to set
     */
    public void setArrayPetugas(ArrayList<Petugas> arrayPetugas) {
        this.arrayPetugas = arrayPetugas;
    }
    
    public void tambahPeminjaman(Peminjaman peminjaman){
        arrayPeminjaman.add(peminjaman);
    }

    /**
     * @return the arrayPeminjaman
     */
    public ArrayList<Peminjaman> getArrayPeminjaman() {
        return arrayPeminjaman;
    }

    /**
     * @param arrayPeminjaman the arrayPeminjaman to set
     */
    public void setArrayPeminjaman(ArrayList<Peminjaman> arrayPeminjaman) {
        this.arrayPeminjaman = arrayPeminjaman;
    }
    
    public Buku getBuku(String idBuku){
        for(Buku b : arrayBuku){
            if(b.getIdBuku().equals(idBuku)){
                return b;
            }
        }
        return null;
    }
    
    public Petugas getPetugas(String idPetugas){
        for(Petugas p : arrayPetugas){
            if(p.idPetugas().equals(idPetugas)){
                return p;
            }
        }
        return null;
    }
    
    public Anggota getAnggota(String idAnggota){
        for(Anggota a : arrayAnggota){
            if(a.getIdAnggota().equals(idAnggota)){
                return a;
            }
        }
        return null;
    }
    
    public Peminjaman getPeminjaman(String idPeminjaman){
        for(Peminjaman p : arrayPeminjaman){
            if(p.getIdPeminjaman().equals(idPeminjaman)){
                return p;
            }
        }
        return null;
    }
    
}
