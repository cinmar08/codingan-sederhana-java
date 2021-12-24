package printer;

import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        // TODO code application logic here
        String maskapai, tujuan;
        int Harga;
        Scanner input =new Scanner (System.in);
        
        System.out.println("Selamat Datang Di Travel Makassar");
        System.out.println("Maskapai apakah yang anda ingin gunakan? ");
        System.out.println("1. Garuda 2.Lion 3. Sriwijaya");
        maskapai=input.next();
        
        if ("Garuda".equalsIgnoreCase(maskapai) ||"1".equalsIgnoreCase(maskapai))
        {
            System.out.println("Kemana Tujuan Anda?");
            System.out.println("1. Jakarta, 2. Surabaya, 3. Bali");
            tujuan= input.next();
        
            if("Jakarta".equalsIgnoreCase(tujuan)){
            Harga=1200000;
            System.out.println(" Total Harga yang harus anda bayar= Rp "+ Harga);
            }
            else if ("Surabaya".equalsIgnoreCase(tujuan)){
            Harga= 600000;
            System.out.println(" Total Harga yang harus anda bayar= Rp"+ Harga);
            }
            else if("Bali".equalsIgnoreCase(tujuan)){
            Harga= 800000;
            System.out.println(" Total Harga yang harus anda bayar = Rp"+ Harga);
            }
            else{
            System.out.println("Mohon Maaf jurusan anda tidak terdaftar");
            }
        }
        else if ("Lion".equalsIgnoreCase(maskapai) || "2".equalsIgnoreCase(maskapai))
        {
            System.out.println("kemana Tujuan Anda?");
            System.out.println("1. Jakarta, 2.Surabaya, 3. Bali");
            
            tujuan=input.next();
            if("Jakarta".equalsIgnoreCase(tujuan)){
            Harga=800000;
            System.out.println("Total Harga yang harus anda bayar =Rp"+Harga);
            }
            else if("Surabaya".equalsIgnoreCase(tujuan)){
            Harga=400000;
            System.out.println("Total Harga yang harus anda bayar =Rp"+Harga);
            }
            else if ("Bali".equalsIgnoreCase(tujuan)){
            Harga=600000;
            System.out.println("Total harga yang harus anda bayar =Rp"+Harga);
            }
            else {
            System.out.println("Mohon Maaf Tujuan anda tidak terdaftar");
            }
        }
        else if ("Sriwijaya".equalsIgnoreCase(maskapai) || "3".equalsIgnoreCase(maskapai))
        {
            System.out.println("kemana Tujuan Anda?");
            System.out.println("1. Jakarta, 2.Surabaya, 3. Bali");
            
            tujuan=input.next();
            if("Jakarta".equalsIgnoreCase(tujuan)){
            Harga=700000;
            System.out.println("Total Harga yang harus anda bayar =Rp"+Harga);
            }
            else if("Surabaya".equalsIgnoreCase(tujuan)){
            Harga=420000;
            System.out.println("Total Harga yang harus anda bayar =Rp"+Harga);
            }
            else if ("Bali".equalsIgnoreCase(tujuan)){
            Harga=550000;
            System.out.println("Total harga yang harus anda bayar =Rp"+Harga);
            }
            else {
            System.out.println("Mohon Maaf Tujuan anda tidak terdaftar");
            }
        }
        else {
            System.out.println("Maskapai yang anda pilih tidak tersedia");
        }
        
        
    }}
