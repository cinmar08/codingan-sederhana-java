package apaini;

import java.util.Scanner;

public class Apaini {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int a, b, c, d;
        int jumlah, discount, total;
        
        System.out.print("MASUKKAN HARGA BARANG PERTAMA = ");
        a = input.nextInt();
        System.out.print("MASUKKAN HARGA BARANG KEDUA = ");
        b = input.nextInt();
        System.out.print("MASUKKAN HARGA BARANG KETIGA = ");
        c = input.nextInt();
        System.out.print("MASUKKAN HARGA BARANG KEEMPAT = ");
        d = input.nextInt();
        
        jumlah = a+b+c+d;
        System.out.println("TOTAL BELANJAAN ADALAH = " +jumlah);
        
        if (jumlah >= 500000){
            discount = jumlah*30/100;
            total = jumlah-discount;
             System.out.println("ANDA MENDAPATKAN POTONGAN HARGA 30%, TOTAL YANG ANDA BAYAR = " +total);
        }
        else if (jumlah >=300000 && jumlah <500000){
            discount = jumlah*20/100;
            total = jumlah-discount;
             System.out.println("ANDA MENDAPATKAN POTONGAN HARGA 20%, TOTAL YANG ANDA BAYAR = " +total);
        }
        else if (jumlah < 300000 && jumlah >=150000){
            discount = jumlah*10/100;
            total = jumlah-discount;
             System.out.println("ANDA MENDAPATKAN POTONGAN HARGA 10%, TOTAL YANG ANDA BAYAR = " +total);
        }
        else{
             System.out.println("ANDA TIDAK MENDAPATKAN POTONGAN HARGA, TOTAL YANG ANDA BAYAR = " +jumlah);
        }
    }
}
