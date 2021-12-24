
package stambuk.dan.nama;

import java.util.Scanner;

public class STAMBUKDANNAMA {
    public static void main(String[] args) {
        // TODO code application logic here
        String nama , stambuk ;
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan Stambuk Anda = "); 
        stambuk = masukan.nextLine();
        
        System.out.println("Masukkan Nama Anda = "); 
        nama = masukan.nextLine();
        
        System.out.println ("______________________________");
        System.out.println("Stambuk Anda ialah = " + stambuk);
        System.out.println("Nama Anda ialah = " + nama);
    }
    
}
