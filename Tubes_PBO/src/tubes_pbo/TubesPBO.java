/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;

public class TubesPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perpustakaan perpus = new Perpustakaan("Perpustakaan");
        
        ArrayList<Anggota> anggota = new ArrayList<>();
        Anggota a = new Anggota("1", "a", "a", "a", "a");
        anggota.add(a);
        a = new Anggota("2", "b", "b", "b", "b");
        anggota.add(a);
        perpus.setArrayAnggota(anggota);
        
        ArrayList<Petugas> petugas = new ArrayList<>();
        Petugas p = new Petugas("11", "aa", "aa", "aa", "aa");
        petugas.add(p);
        perpus.setArrayPetugas(petugas);
                
        ArrayList<Buku> buku = new ArrayList<>();
        Buku b = new Buku("1", "buku1", "1", "Baik");
        buku.add(b);
        b = new Buku("2", "buku2", "2", "Baik");
        buku.add(b);
        perpus.setArrayBuku(buku);
        
        ArrayList<Buku> buku1 = new ArrayList<>();
        Buku b1 = new Buku("1", "buku1", "1", "Baik");
        buku1.add(b1);
        perpus.setArrayBuku(buku1);
        perpus.inputPeminjaman1("1", a, p, buku1);

        
        Console c = new Console(perpus);
        c.MenuUtama();
    }
    
}
