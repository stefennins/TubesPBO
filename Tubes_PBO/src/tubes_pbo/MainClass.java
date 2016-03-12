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
public class MainClass {
     public static void main(String[] args) {
        
        Perpustakaan perpus = new Perpustakaan("Perpustakaan");
        
        Petugas ptgs1 = new Petugas("PGS-01", "Stephanus", "admin", "admin", "Jakarta");
        perpus.tambahPetugas(ptgs1);

        Anggota angt1 = new Anggota("AGT-01", "Indri", "indri", "indri", "Bandung");
        perpus.tambahAnggota(angt1);
        Anggota angt2 = new Anggota("AGT-02", "Adi", "indri", "indri", "Surabaya");
        perpus.tambahAnggota(angt2);
       
        
        Buku buku1 = new Buku("BK-01", "Psikologi Anak", "Fred", "Baru");
        perpus.tambahBuku(buku1);
        Buku buku2 = new Buku("BK-02", "Quantum Physic", "Albert", "Baru");
        perpus.tambahBuku(buku2);
        Buku buku3 = new Buku("BK-03", "Big Bang Theory", "Rose", "Baru");
        perpus.tambahBuku(buku3);
        
        System.out.println("Peminjaman 1");
        Peminjaman p1 = new Peminjaman("PJM-01", "11/Februari/2016", 2, angt1, ptgs1);
        p1.addBuku(buku1);
        p1.addBuku(buku2);
        p1.addBuku(buku3); //error karena melebihi batas pinjam
        perpus.tambahPeminjaman(p1);
        
        System.out.println("\nMengembalikan Buku 2");
        perpus.getBuku("BK-02").setDipinjam(false);//buku id 2002 di kembalikan
        
        System.out.println("\nPeminjaman 2");
        Peminjaman p2 = new Peminjaman("PJM-02", "12/Februari/2016", 4, angt2, ptgs1);
        p2.addBuku(buku1); //error karena buku masih di pinjam
        p2.addBuku(buku2);
        p2.addBuku(buku3); 
        perpus.tambahPeminjaman(p2);
        
        System.out.println("\nOutput Array Peminjaman");
        for(Peminjaman p : perpus.getArrayPeminjaman()){
            System.out.println("Kode Peminjaman : "+p.getIdPeminjaman());
            System.out.println("Peminjam : "+p.getPeminjam().getNama());
            System.out.println("Petugas : "+p.getPetugas().getNama());
            System.out.println("Jumlah Buku : "+p.getJumlahBuku());
            if(p.getJumlahBuku()>0){
                System.out.println("Buku : ");
                for(int i=0; p.getJumlahBuku() > i; i++){
                    System.out.println("- "+p.getBuku()[i].getJudul());
                }
            }
        }
    }
    
}

}
