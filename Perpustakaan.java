/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Perpustakaan {
    
    private String nama;
    private int jmlPeminjaman = 3;
    private ArrayList<Buku> arrayBuku;
    private ArrayList<Anggota> arrayAnggota;
    private ArrayList<Petugas> arrayPetugas;
    private ArrayList<Peminjaman> arrayPeminjaman;
    Scanner scanString = new Scanner(System.in);
    
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
            if(p.getIdPetugas().equals(idPetugas)){
                return p;
            }
        }
        return null;
    }
    
    public Petugas getPetugas(String username, String password){
        for(Petugas p : arrayPetugas){
            if((p.getUsername().equals(username)) && (p.getPassword().equals(password))){
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
    
    public Anggota getAnggotaUsername(String username){
        for(Anggota a : arrayAnggota){
            if(a.getUsername().equals(username)){
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
    
    public int getJumlahAnggota() {
        return arrayAnggota.size();
    }
    
    public Anggota searchIdAnggota(String id) {
        for(Anggota a : arrayAnggota) {
            if(a.getIdAnggota().equals(id)){
                return a;
            }
        }
        return null;
    }
    
    //public boolean ubahKondisiBuku(String kondisi, Buku b){
        
    //}
    
    public Anggota getAnggotaByUserPass(String username, String password) {
        for(Anggota a : arrayAnggota){
            if(a.getUsername().equals(username) && a.getPassword().equals(password))
            return a;
        }
        return null;
    }
    
    public boolean cekStatus(String username, String password){
        for(Anggota a : arrayAnggota){
            if(a.getUsername().equals(username)){
                if(a.getPassword().equals(password)){
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    
    public void inputPeminjaman(String tgl, Anggota anggota, Petugas petugas){
        Peminjaman p = new Peminjaman("P"+jmlPeminjaman, tgl, 6, anggota, petugas);
        boolean tambah = true;
        while(tambah){
            System.out.print("Masukkan idBuku : ");
            String id = scanString.nextLine();
            Buku b = cariBuku(id);
            if(b!=null){
                p.addBuku(b);
            } else {
                System.out.println("Buku TIdak Ditemukan");
            }
            System.out.println("Selesai? (y/t)");
            String i = scanString.nextLine();
            if(i.equals("y")){
                tambah = false;
            }
        }
        arrayPeminjaman.add(p);
    }
    
    public void inputPeminjaman1(String tgl, Anggota anggota, Petugas petugas, ArrayList<Buku> b){
        Peminjaman p = new Peminjaman("P"+jmlPeminjaman, tgl, 6, anggota, petugas);
        for(Buku buku : b){
            p.addBuku(buku);
        }
        arrayPeminjaman.add(p);
    }
    
    public Buku cariBuku(String idBuku){
        for(Buku b : arrayBuku){
            if(b.getIdBuku().equals(idBuku)){
                return b;
            }
        }
        return null;
    }
    
    public ArrayList<Peminjaman> getPeminjaman(Anggota a){
        ArrayList<Peminjaman> p = new ArrayList<>();
        for(Peminjaman p1 : arrayPeminjaman){
            if(p1.getPeminjam().equals(a)){
                p.add(p1);
            }
        }
        return p;
    }
    
}
