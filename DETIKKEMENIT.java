package detik.ke.menit;

import java.util.Scanner;

public class DETIKKEMENIT {
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System.in);
      System.out.println("KONVERSI DETIK KE MENIT");
      System.out.println("MASUKKAN ANGKA DALAM BEBERAPA DETIK");
      int detik = input.nextInt();
      
      System.out.println("hasil konversi: "detik+"detik=*+konversiDetikKeMenit(detik)"+"menit");
      
    }
    
}
