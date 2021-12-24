
package luas.dan.keliling.lingkaran;

import java.util.Scanner;

public class LuasDanKelilingLingkaran {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
    double luas , keliling, phi = 22/7;
    int r;
    System.out.println("MENGHITUNG LUAS LINGKARAN");
    System.out.print ("masukkan jari-jari = ");
    r = input.nextInt();
    luas = phi * r* r;
    System.out.println("luas lingkaran = " + luas);
    
    System.out.println("______________________________________________");
    
    System.out.println("MENGHITUNG KELILING LINGKARAN");
    System.out.print("masukkan jari-jari = ");
    r = input.nextInt();
    keliling = 1/2 * phi * r;
    System.out.println("keliling lingkaran = " + keliling);
    }
    
}
