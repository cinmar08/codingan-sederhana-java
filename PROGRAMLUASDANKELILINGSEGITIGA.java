package program.luas.dan.keliling.segitiga;

import java.util.Scanner;

public class PROGRAMLUASDANKELILINGSEGITIGA {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int A, B, C, keliling;
    int alas, tinggi, luas;
    System.out.println("MENGHITUNG KELILING SEGITIGA");
    System.out.print ("masukkan sisi A = ");
    A = input.nextInt();
    System.out.print ("masukkan sisi B = ");
    B = input.nextInt();
    System.out.print ("masukkan sisi C = ");
    C = input.nextInt();
    
    keliling = A+B+C;
    System.out.println("KELILING SEGITIGA = " + keliling);
    
    System.out.println("________________________________________");
            
    System.out.println("MENGHITUNG LUAS SEGITIGA");
    System.out.print("masukkan alas = ");
    alas = input.nextInt();
    System.out.print("masukkan tinggi = ");
    tinggi = input.nextInt();
    luas = (alas*tinggi)/2;
    System.out.println("LUAS SEGITIGA = " + luas);
    }
    
}
