package tugas.praktikum.alpro;

import java.util.Scanner;

public class TUGASPRAKTIKUMALPRO {
    public static void main(String[] args) {
    String Namalengkap,tempatlahir, tanggallahir,agama, alamat, alasanmemilihatmajaya; 
    String nomorteleponrumah, programstudi, fakultas, universitas, asalSMA, jurusanSMA;
    int nomorhandphone, nomorKTP;
    Scanner masukan = new Scanner(System.in);
    System.out.println("MASUKKAN BIODATA ANDA");
    System.out.println("NAMA LENGKAP = ");
    Namalengkap = masukan.nextLine();
    System.out.println("PROGRAM STUDI = ");
    programstudi = masukan.nextLine();
    System.out.println("FAKULTAS = ");
    fakultas = masukan.nextLine();
    System.out.println("UNIVERSITAS = "); 
    universitas = masukan.nextLine();
    System.out.println("ASAL SMA = "); 
    asalSMA = masukan.nextLine();
    System.out.println("JURUSAN SMA = "); 
    jurusanSMA = masukan.nextLine();
    System.out.println("ALAMAT = "); 
    alamat = masukan.nextLine();
    System.out.println("TEMPAT LAHIR = ");
    tempatlahir = masukan.nextLine();
    System.out.println("TANGGAL LAHIR = "); 
    tanggallahir = masukan.nextLine();
    System.out.println("NOMOR TELEPON RUMAH = "); 
    nomorteleponrumah = masukan.nextLine();
    System.out.println("NOMOR HANDPHONE = "); 
    nomorhandphone = masukan.nextInt();
    System.out.println("NOMOR KTP = "); 
    nomorKTP = masukan.nextInt();
    System.out.println("AGAMA = "); 
    agama = masukan.nextLine();
    System.out.println("ALASAN MEMILIH ATMA JAYA = ");
    alasanmemilihatmajaya = masukan.nextLine();
    
    System.out.println ("___________________________________________");
    System.out.println("NAMA LENGKAP = " + Namalengkap);
    System.out.println("PROGRAM STUDI = " + programstudi);
    System.out.println("FAKULTAS = " + fakultas);
    System.out.println("UNIVERSITAS = " + universitas); 
    System.out.println("ASAL SMA = " + asalSMA); 
    System.out.println("JURUSAN SMA = " + jurusanSMA); 
    System.out.println("ALAMAT = " + alamat); 
    System.out.println("TEMPAT LAHIR = " + tempatlahir);
    System.out.println("TANGGAL LAHIR = " + tanggallahir); 
    System.out.println("NOMOR TELEPON RUMAH = " + nomorteleponrumah); 
    System.out.println("NOMOR HANDPHONE = " + nomorhandphone); 
    System.out.println("NOMOR KTP = " + nomorKTP); 
    System.out.println("AGAMA = " + agama); 
    System.out.println("ALASAN MEMILIH ATMA JAYA = " + alasanmemilihatmajaya);
    
    }
    
}
