package tubespbo;

import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indri's Property
 */
public class Console {
    
    Perpustakaan app;
    Scanner scanString = new Scanner(System.in);
    Scanner scanInteger = new Scanner(System.in);
    
    public Console(Perpustakaan p) {
        this.app = p;
    }    
    public void MenuUtama(){
        String pilih;
        while(true){
            System.out.println("Menu Utama");
            System.out.println("Pilih Menu");
            System.out.println("1. Login Anggota");
            System.out.println("2. Daftar Anggota");
            System.out.println("3. Login Petugas");
            System.out.println("4. Cek Kondisi Buku");
            System.out.println("5. Keluar");

            System.out.println("");

            pilih = scanString.nextLine();
            switch (pilih){
                case "1" :
                {
                    String username, password;
                    System.out.println("Login Anggota");
                    System.out.println("Masukan Username Anggota");
                    username = scanString.nextLine();
                    System.out.println("Masukan Password");
                    password = scanString.nextLine();
                    boolean kondisi = app.cekStatus(username, password);
                    System.out.println(kondisi);
                    if(kondisi){
                        Anggota angota = app.getAnggotaUsername(username);
                        menuAnggota(angota);
                    } else {
                        System.out.println("Invalid login");
                        System.out.println("0.Back to Main Menu");
                    }
                break;
                }
                case "2" :
                {    
                    String nama, alamat, username, password, id;
                    System.out.println("Daftar Anggota");
                    System.out.println("Masukan Nama");
                    nama = scanString.nextLine();
                    System.out.println("Masukan Alamat");
                    alamat = scanString.nextLine();
                    System.out.println("Masukan Username");
                    username = scanString.nextLine();
                    System.out.println("Masukan Password");
                    password = scanString.nextLine();
                    id = generateID(app);
                    System.out.println("ID Anggota Anda : " + id);
                    app.tambahAnggota(new Anggota(id,nama,username,password,alamat));
                    System.out.println("0.Back to Main Menu (Untuk Login)");
                break;
                }
                case "3" :
                {    
                    String username, password;
                    System.out.println("Login Petugas");
                    System.out.println("Masukan Username Petugas");
                    username = scanString.nextLine();
                    System.out.println("Password");
                    password = scanString.nextLine();
                    if(app.getPetugas(username, password) != null)
                    {   
                        System.out.println("0. Back to Main Menu");
                    }
                    else 
                        menuPetugas();
                break;
                }
                case "4" :
                {
                    String idBuku;
                    Buku b;
                    System.out.println("Cek Kondisi Buku");
                    System.out.println("Masukan Id Buku");
                    idBuku = scanString.nextLine();
                    b = app.getBuku(idBuku);
                    if (b == null){
                        System.out.println("ID buku tidak ditemukan");
                    }
                    else {
                        System.out.println("ID Buku : " +b.getIdBuku());
                        System.out.println("Judul Buku : "+b.getJudul());
                        System.out.println("Kondisi : "+b.getKondisi());
                        System.out.println("");
                        System.out.println("0. Back to Main Menu");
                    }
                    break;
                }
                case "5" :
                {
                    return;
                }
            }
        
        }
    }
    
    public void menuPetugas() {
        String pilih;
        System.out.println("Menu Petugas");
        System.out.println("1. Tambah Pinjaman Anggota");
        System.out.println("2. Kembalikan Buku Anggota");
        System.out.println("3. Ubah Kondisi Buku");
        System.out.println("4. Tambahkan Buku ke Perpustakaan");
        System.out.println("0. Back To Main Menu");
        pilih = scanString.nextLine();
        switch (pilih){
            case "1" :
            {
                AnggotaPinjam(); break;
            }    
            case "2" :
                
            case "3" :
            {
                Buku b = new Buku();
                String idBuku, kondisi;
                System.out.println("Ubah Kondisi Buku");
                System.out.println("Masukan ID Buku : ");
                idBuku = scanString.nextLine();
                System.out.println("Masukan Kondisi Buku : (Baik / Buruk ");
            }
            case "4" :
            {
                String idBuku, judul, pengarang, kondisi  ;
                System.out.println("Tambahkan Buku ke Perpustakaan");
                System.out.println("1. Masukan ID Buku ");
                idBuku = scanString.nextLine();
                System.out.println("2. Masukan Judul");
                judul = scanString.nextLine();
                System.out.println("3. Masukan Pengarang");
                pengarang = scanString.nextLine();
                System.out.println("4. Masukan Kondisi Buku (Baik / Buruk )");
                kondisi = scanString.nextLine();  
                System.out.println("0. Back to Main Menu");
                
            }
            
    
        }
        
        System.out.println("");
    }
    
    public void AnggotaPinjam(){
        System.out.println("Masukan ID Anggota");
        String id; Anggota anggota = null;
        id = scanString.nextLine();
        for(Anggota a : app.getArrayAnggota()) {
            if(a.getIdAnggota().equals(id)){
                anggota = a; break;
            }
        }
        if(anggota == null){
            String answer;
            System.out.println("Invalid ID Anggota");
            System.out.println("1. Coba Lagi");
            System.out.println("0. Back To Main Menu");
            answer = scanString.nextLine();
            switch(answer)
            {
                case "1" : AnggotaPinjam(); break;
                case "0" : menuPetugas(); break;
            }
        }
        else {
            boolean done = false;
            while(!done) {
                int jumlahBuku;
                System.out.println("Masukan jumlah buku yang dipinjam anggota ");
                jumlahBuku = scanInteger.nextInt();
                int jumlahPinjam = 0;
//                for(Peminjaman p : anggota.getPeminjaman()){
//                    jumlahPinjam += p.getJumlahBuku();
//                }
                if((jumlahPinjam + jumlahBuku) <= 6) {
                    Peminjaman pinjam = new Peminjaman(anggota, "", jumlahBuku);
                    String idBuku;
                    for(int i = 0; i < jumlahBuku; i++) {
                        System.out.println("Masukan ID Buku");
                        idBuku = scanString.nextLine();
                        Buku b = app.getBuku(idBuku);
                        if(b != null) {
                            pinjam.addBuku(b);
                            System.out.println("Status Peminjaman : Buku berhasil di pinjam ");
                        }
                        else {
                            if(b == null) System.out.println("ID Buku tidak ditemukan");
                            i--;
                        }
                    }
                    //anggota.getPeminjaman().add(pinjam);
                }
                else if(jumlahPinjam == 6) {
                    System.out.println("Anda sudah melebihi batas maksimal peminjaman buku");
                }
                else {    
                    System.out.println("Anda masih bisa meminjam " + (6-jumlahPinjam));
                    String answer; boolean back = true;
                    while(back) {
                        System.out.println("Apakah anda masih mau menambah pinjaman?(Ya/Tidak)");
                        answer = scanString.nextLine();
                        switch(answer)
                        {
                            case "Ya" : back = false; break;
                            case "Tidak" : back =false; done = true;
                            default      : break;
                        }
                    }
                }
            }
        }
        String tglPeminjaman;
        System.out.println("Masukan Tanggal Pinjam : ");
        tglPeminjaman = scanString.nextLine();        
        System.out.println("Detail Pinjam : ");
    }
 
    
    public void kembalikanBuku(){
        System.out.println("Masukan ID Anggota");
        String id; Anggota anggota = null;
        id = scanString.nextLine();
        anggota = app.searchIdAnggota(id);
        if(anggota == null){
            String answer;
            System.out.println("Invalid ID Anggota");
            System.out.println("1. Coba Lagi");
            System.out.println("0. Back To Main Menu");
            answer = scanString.nextLine();
            switch(answer)
            {
                case "1" : kembalikanBuku(); break;
                case "0" : menuPetugas(); break;
            }
        }
        else {
            Buku b = null;
            Peminjaman pj = null;
            String idBuku;
            boolean back = true;
            while(back) {
                System.out.println("Masukan ID Buku yang ingin dikembalikan : ");
                idBuku= scanString.nextLine();
//                for(Peminjaman p : anggota.getPeminjaman()){
//                    for(Buku bk : p.getArrayBuku()) {
//                        if(bk.getIdBuku().equals(idBuku)) {
//                            pj = p;
//                            b = bk;
//                            break;
//                        }
//                    }
//                }
                if(b == null) {
                    System.out.println("ID Buku tidak di temukan");
                    System.out.println("Coba Lagi ? (Ya/Tidak)");
                    String Ya;
                    Ya = scanString.nextLine();
                    if(Ya.equals("Tidak")) back = false;
                }
                else {
                    //anggota.getPeminjaman().remove(b);
                    System.out.println("Buku Berhasil dikembalikan");
                    if(pj.getArrayBuku().isEmpty()) pj.setStatusDikembalikan();
                }
            }
        }
    }
    
    public String generateID(Perpustakaan P) {
        int jumlahAnggota = P.getJumlahAnggota();
        if(jumlahAnggota < 10) return ("000" + Integer.toString(jumlahAnggota));
        else if(jumlahAnggota < 100) return ("00" + Integer.toString(jumlahAnggota));
        else if (jumlahAnggota < 1000) return ("0" + Integer.toString(jumlahAnggota));
        else return Integer.toString(jumlahAnggota);
    }
    
    public void menuAnggota(Anggota a) {
        String pilih;
        
        while(true){
            System.out.println("Menu Anggota");
            System.out.println("1. View Daftar Pinjaman");
            System.out.println("2. View Daftar Buku dari Peminjaman ");
            System.out.println("0. Back To Main Menu");
            pilih = scanString.nextLine();
            switch (pilih){
                case "1" :
                {
                    System.out.println("View Daftar Pinjaman");
                    System.out.println("Anggota ID : "+a.getIdAnggota());
                    System.out.println("Daftar Peminjaman");
                    System.out.println("");
                    ArrayList<Peminjaman> pem = app.getPeminjaman(a);
                    for(Peminjaman p : pem){
                        System.out.println(p.getIdPeminjaman());
                    }
                    break;
                }

                case "2" :
                {
                    String idPinjaman;
                    System.out.println("View Daftar Buku dari Peminjaman");
                    System.out.println("Masukan ID Peminjaman :");
                    idPinjaman = scanString.nextLine();
                    System.out.println("Detail Pinjaman : ");
                    ArrayList<Peminjaman> pem = app.getPeminjaman(a);
                    for(Peminjaman p : pem){
                        if(p.getIdPeminjaman().equals(idPinjaman)){
                            System.out.println(p.toString());
                        }
                    }
                    break;
                }
                
                case "0" :
                {
                    return;
                }
            }
        }
        
    }
}

//    public void detailPeminjaman() {
        
//}


