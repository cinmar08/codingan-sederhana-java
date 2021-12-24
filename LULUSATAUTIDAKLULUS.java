/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lulusatautidaklulus;

import java.util.Scanner;
public class LULUSATAUTIDAKLULUS {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
        int nilai;
        
        System.out.println("MASUKKAN NILAI ANDA = ");
        nilai = input.nextInt();
        
        if (nilai >= 70){
        System.out.println("NILAI ANDA ADALAH = " +nilai + " MAKA ANDA DINYATAKAN = LULUS ");
        }
        else {
        System.out.println("NILAI ANDA ADALAH = " +nilai + " MAKA ANDA DINYATAKAN = TIDAK LULUS ");
    }
        
    }
    
}
