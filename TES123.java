package tes123;

import java.util.Scanner;

public class TES123 {
    public static void main(String[] args) {
        // TODO code application logic here
        int suhu;
        Scanner input = new Scanner (System.in);
         System.out.print("MASUKKAN SUHU = ");
        suhu = input.nextInt();
        if (suhu >= 32){
            System.out.println("cuaca sangat panas");
        }
        else if (suhu<32 && suhu>=27){
             System.out.println("cuaca panas");
        }
        else if (suhu>5 && suhu<15){
             System.out.println("cuaca dingin");
        }
        else if (suhu<=5){
             System.out.println("cuaca sangat dingin");
        }
        else{
           System.out.println("cuaca normal"); 
        }
    }
    
}
