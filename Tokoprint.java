package tokoprint;

import java.util.Scanner;

public class Tokoprint {
    public static void main(String[] args) {
        // TODO code application logic here
    String printer, ukuran;
    int lembar, harga, total;
    Scanner input = new Scanner (System.in);
    
    System.out.println("Selamat Datang di Toko Kami");
    System.out.println("Ingin Print Hitam/Warna/Gambar");
    printer = input.nextLine();
    
    if (printer.equalsIgnoreCase("hitam"))
    {
    System.out.println("ingin ukuran berapa?(A4/F4");
    ukuran = input.nextLine();
        if (ukuran.equalsIgnoreCase("A4"))
        {
        System.out.println("Berapa lembar?");
        lembar =input.nextInt();
           if (lembar<=50);{
            harga = 1000;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
           }
           
        }
    }
    
    }
    
    }
