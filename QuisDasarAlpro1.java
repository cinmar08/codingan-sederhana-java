package quisdasaralpro1;

import java.util.Scanner;

public class QuisDasarAlpro1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int a, b, c;
        
        System.out.print("MASUKKAN PANJANG SISI A = ");
        a = input.nextInt();
        System.out.print("MASUKKAN PANJANG SISI B = ");
        b = input.nextInt();
        System.out.print("MASUKKAN PANJANG SISI C = ");
        c = input.nextInt();
        
        if (a==b&&b==c&&c==a){
        System.out.println("segitiga tersebut valid dan disebut segitiga sama sisi");
        }
        else if (a==b||b==c||c==a){
        System.out.println("segitiga tersebut valid dan disebut segitiga sama kaki");
        }
        else {
        System.out.println("segitiga tersebut invalid karena semua sisi berbeda");
        }
    }
    
}
