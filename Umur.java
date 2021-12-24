/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umur;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Umur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int umur;
        String nama;
        System.out.println("MASUKKAN NAMA = ");
        nama = input.nextLine();
        System.out.println("MASUKKAN UMUR = ");
        umur = input.nextInt();
        
        if (umur>=60){
            System.out.println("Tuan "+nama +",Apakah anda sudah pensiun?");
                    }
        else if (umur<60 && umur>=25){
            System.out.println("Saudara "+nama+ ",Apakah anda masih aktif bekerja?");}
        else {
            System.out.println("Adik "+nama+ ",Apakah anda masih sekolah?");
                            }
    }
    
}
