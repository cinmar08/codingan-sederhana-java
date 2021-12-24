/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TUGAS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
        int fotocopy, harga;
        
        System.out.println("MASUKKAN JUMLAH FOTOCOPY = ");
        fotocopy = input.nextInt();
        
        if (fotocopy < 100){
            harga = fotocopy * 250;
            System.out.println("harga yang harus dibayar adalah = "+harga);
        }
        else {
            harga = fotocopy * 150;
        System.out.println("harga yang harus dibayar adalah = "+harga);
    }
        }
        
    
}
