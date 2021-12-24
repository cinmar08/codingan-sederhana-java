package hurufvokalataukonsonan;

import java.util.Scanner;

public class HurufVokalAtauKonsonan {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String huruf;
        System.out.println("PROGRAM MENENTUKAN HURUF VOKAL DAN KONSONAN");
        System.out.println("--------------------------------------------------------");
        System.out.println("MASUKKAN HURUF = ");
        huruf = input.nextLine();
        if ("a".equalsIgnoreCase(huruf)||"i".equalsIgnoreCase(huruf)||"u".equalsIgnoreCase(huruf)||"e".equalsIgnoreCase(huruf)||"o".equalsIgnoreCase(huruf))
        {
            System.out.println("HURUF " + huruf + " ADALAH HURUF VOKAL");
        }
        else {
            System.out.println("HURUF " + huruf + " ADALAH HURUF KONSONAN");
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("NAMA : CINDY MARANATHA");
        System.out.println("STAMBUK : 2161030");
        
    }
    
}
