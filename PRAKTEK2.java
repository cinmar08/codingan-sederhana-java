/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek2;

import java.util.Scanner;

public class PRAKTEK2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int nilai;
        
        System.out.println("MASUKKAN NILAI ANDA = ");
        nilai = input.nextInt();
        
        if (nilai>=1 && nilai<=100){
        System.out.println("MAKA NILAI DINYATAKAN ABSAH ");
        }
        else {
        System.out.println("MAKA NILAI DINYATAKAN TIDAK ABSAH");
    }
    
    }}
