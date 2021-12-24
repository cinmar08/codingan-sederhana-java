package kurs.uang;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class KURSUANG {
    public static void main(String[] args) {
        // TODO code application logic here
        float rupiah, yen , euro;
        Scanner input = new Scanner (System.in);
        System.out.println("KONVERSI KURS MATA UANG RUPIAH");
        System.out.println("_________________________________________________________");
        System.out.println("masukkan rupiah = ");
        rupiah = input.nextFloat();
        euro = (float)(rupiah * 0.000050);
        yen = (float)(rupiah * 0.0076);
        
        System.out.println("_________________________________________________________");
        System.out.println();
        System.out.println("hasil kurs = ");
        System.out.println("euro = " + euro);
        System.out.println("yen = " + yen);
        
    }
    
}
