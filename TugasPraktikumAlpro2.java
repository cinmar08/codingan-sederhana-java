package tugaspraktikumalpro2;

import java.util.Scanner;

public class TugasPraktikumAlpro2 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
    int P, L, T , volume;
    System.out.println("MENGHITUNG VOLUME BALOK");
    System.out.print ("masukkan panjang = ");
    P = input.nextInt();
    System.out.print ("masukkan lebar = ");
    L = input.nextInt();
    System.out.print ("masukkan tinggi = ");
    T = input.nextInt();

    volume = P*L*T;
    System.out.println("VOLUME BALOK = " + volume);
    
    System.out.println("________________________________________");
            
   
    }
    
}
