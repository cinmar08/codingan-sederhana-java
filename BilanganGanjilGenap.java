package bilanganganjilgenap;

import java.util.Scanner;

public class BilanganGanjilGenap {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int bil;
        System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL DAN GENAP");
        System.out.println("--------------------------------------------------------");
        System.out.println("MASUKKAN BILANGAN = ");
        bil = input.nextInt();
        
        if (bil%2==0){
            System.out.println("bilangan " + bil + " adalah bilangan genap");
        }
        else {
            System.out.println("bilangan " +bil + " adalah bilangan ganjil");
        }
     
        System.out.println("--------------------------------------------------------");
        System.out.println("NAMA : CINDY MARANATHA");
        System.out.println("STAMBUK : 2161030");
    }
    
}
