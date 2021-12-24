
package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {
    public static void main(String[] args) {
    int bil1, bil2, bil3, hasil;
    Scanner masukan = new Scanner(System.in);
    System.out.println("Masukkan bil1 = ");
    bil1 = masukan.nextInt();
    
     System.out.println("Masukkan bil2 = ");
      bil2 = masukan.nextInt();
      
     System.out.println("Masukkan bil3 = ");
      bil3 = masukan.nextInt();
      
      hasil = bil1 * bil2 * bil3;
      System.out.println("hasil = " + hasil);
      
    }
    
}
