package jumlahperangko;

import java.util.Scanner;

public class JumlahPerangko {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int surat, perangko;
        
        System.out.println("MASUKKAN JUMLAH SURAT = ");
        surat = input.nextInt();
        
        if (surat % 5 == 0){
        perangko = surat / 5 * 1;
        System.out.println("JUMLAH PERANGKO YANG DIBUTUHKAN ADALAH = " +perangko);
        }
        else {
        perangko = surat / 5 * 1 + 1;
        System.out.println("JUMLAH PERANGKO YANG DIBUTUHKAN ADALAH = " +perangko);
    }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("NAMA : CINDY MARANATHA");
        System.out.println("STAMBUK : 2161030");
    }}
