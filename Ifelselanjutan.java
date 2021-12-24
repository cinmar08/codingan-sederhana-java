package ifelselanjutan;

import java.util.Scanner;

public class Ifelselanjutan {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int a, b, c;
        int sisi;
        System.out.println("MASUKKAN SISI A = ");
        a = input.nextInt();
        System.out.println("MASUKKAN SISI B = ");
        b = input.nextInt();
        System.out.println("MASUKKAN SISI C = ");
        c = input.nextInt();
        
        if (a==b&&b==c&&c==a){
            System.out.println("sama sisi");
                    }
        else if (a==b||b==c||c==a){
                    System.out.println("sama kaki");}
                    else {
                    System.out.println("semua sisi berbeda");
                            }
        }
        
    }
    

