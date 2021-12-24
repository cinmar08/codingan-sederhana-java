package hargabarang;

import java.util.Scanner;

public class HargaBarang {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
        int a, b, c;
        int jumlah, discount, total;
        
        System.out.println("--------------------------------------------------------");
        
        System.out.println("MASUKKAN HARGA BARANG PERTAMA = ");
        a = input.nextInt();
        System.out.println("MASUKKAN HARGA BARANG KEDUA = ");
        b = input.nextInt();
        System.out.println("MASUKKAN HARGA BARANG KETIGA = ");
        c = input.nextInt();
        
        jumlah = a+b+c;
        System.out.println("TOTAL BELANJAAN ADALAH = " +jumlah);
        
        if (jumlah >= 250000){
            discount = jumlah*15/100;
            total = jumlah-discount;
             System.out.println("ANDA MENDAPATKAN POTONGAN HARGA, TOTAL YANG ANDA BAYAR = " +total);
        }
        else {
            System.out.println("ANDA TIDAK MENDAPATKAN POTONGAN HARGA, TOTAL  YANG ANDA BAYAR = " +jumlah);
    }
        System.out.println("--------------------------------------------------------");
        System.out.println("NAMA : CINDY MARANATHA");
        System.out.println("STAMBUK : 2161030");
    }
    
}
