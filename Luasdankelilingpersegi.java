/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasdankelilingpersegi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Luasdankelilingpersegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    int sisi, luas , keliling;
    System.out.println("MENGHITUNG LUAS PERSEGI");
    System.out.print ("masukkan sisi = ");
    sisi = input.nextInt();
    luas = sisi * sisi;
    System.out.println("luas persegi = " + luas);
    
    System.out.println("________________________________________");
            
    System.out.println("MENGHITUNG KELILING PERSEGI");
    System.out.print("masukkan sisi = ");
    sisi = input.nextInt();
    keliling = 4 * sisi;
    System.out.println("keliling persegi = " + keliling);
    }

    }
   
