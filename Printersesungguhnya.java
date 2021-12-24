package printersesungguhnya;

import java.util.Scanner;

public class Printersesungguhnya {
    public static void main(String[] args) {
        // TODO code application logic here
    String printer, ukuran;
    int lembar, harga, total;
    Scanner input = new Scanner (System.in);
    
    System.out.println("Selamat Datang di Toko Kami");
    System.out.print("Ingin Print Hitam/Warna/Gambar");
    printer = input.nextLine();
    
    if (printer.equalsIgnoreCase("hitam"))
    {
    System.out.println("ingin ukuran berapa?(A4/F4)");
    ukuran = input.nextLine();
        if (ukuran.equalsIgnoreCase("A4"))
        {
        System.out.println("Berapa lembar?");
        lembar =input.nextInt();
        
            if (lembar<=50)
            {
            harga = 1000;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
            else if(lembar>50)
            {
            harga = 750;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
        }
        else if ("Ukuran".equalsIgnoreCase("F4"))
        {
        System.out.println("Berapa lembar?");
        lembar =input.nextInt();
            if (lembar<=50)
            {
            harga = 1250;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
            else if (lembar>50)
            {
            harga = 1000;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
        }
    }
    else if (printer.equalsIgnoreCase("warna"))
    {
    System.out.println("ingin ukuran berapa?(A4/F4");
    ukuran = input.nextLine();
        if (ukuran.equalsIgnoreCase("A4"))
        {
        System.out.println("Berapa lembar?");
        lembar =input.nextInt();
        
            if (lembar<=30)
            {
            harga = 1500;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
            else if (lembar>30)
            {
            harga = 1100;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
        }
        else if ("Ukuran".equalsIgnoreCase("F4"))
        {
        System.out.println("Berapa lembar?");
        lembar =input.nextInt();
            if (lembar<=30)
            {
            harga = 1750;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
            else if (lembar>30)
            {
            harga = 1550;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
        }
    }
    else if (printer.equalsIgnoreCase("gambar"))
    {
    System.out.println("ingin ukuran berapa?(A4/F4");
    ukuran = input.nextLine();
        if (ukuran.equalsIgnoreCase("A4"))
        {
        System.out.println("Berapa lembar?");
        lembar =input.nextInt();
        
            if (lembar<=20)
            {
            harga = 2000;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
            else if (lembar>20)
            {
            harga = 1700;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
        }
        else if ("Ukuran".equalsIgnoreCase("F4"))
        {
        System.out.println("Berapa lembar?");
        lembar =input.nextInt();
            if (lembar<=20)
            {
            harga = 2250;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
            else if (lembar>20)
            {
            harga = 2100;
            total = lembar*harga;
            System.out.println("yang perlu anda bayar adalah = " +total);
            }
        }
    }
    
    
    
    }}
