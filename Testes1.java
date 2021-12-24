package testes1;

import java.util.Scanner;

public class Testes1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int angkatan ;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Angkatan = ");
angkatan = input.nextInt();

if(angkatan <= 2018)
{
System.out.println("Biaya kuliah Semester ini = Rp. 5.000.000");
}
else if(angkatan >= 2019 )
{
String fak;
int x,y,biaya;
System.out.println("Masukkan Fakultas = ");
fak = input.next();

    if ("FTI".equalsIgnoreCase(fak))
    {
    System.out.println("Masukkan SKS tatap muka = ");
    x = input.nextInt();
    System.out.println("Masukkan SKS pratikum = ");
    y = input.nextInt();
    
        if(x+y <= 24){
        biaya = 2500000+(x*100000)+(y*150000);
        System.out.println("Biaya Semester ini = Rp. "+biaya);
        }
        else{
        System.out.println("Jumlah SKS lebih dari 24");
        }
    }
    else if("FT".equalsIgnoreCase(fak))
    {
    System.out.println("Masukkan SKS tatap muka = ");
    x = input.nextInt();
    System.out.println("Masukkan SKS pratikum = ");
    y = input.nextInt();
    
        if(x+y <= 24){
        biaya = 2250000+(x*100000)+(y*150000);
        System.out.println("Biaya Semester ini = Rp. "+biaya);
        }
        else{
        System.out.println("Jumlah SKS lebih dari 24");
        }
    }
    else if("FH".equalsIgnoreCase(fak))
    {
    System.out.println("Masukkan SKS tatap muka = ");
    x = input.nextInt();
    
        if(x <= 24){
        biaya = 2275000+(x*100000);
        System.out.println("Biaya Semester ini = Rp. "+biaya);
        }
        else{
        System.out.println("Jumlah SKS lebih dari 24");
        }
    }
    else if("FE".equalsIgnoreCase(fak) || "FPSI".equalsIgnoreCase(fak))
    {
    System.out.println("Masukkan SKS tatap muka = ");
    x = input.nextInt();
    
        if(x <= 24){
        biaya = 2150000+(x*100000);
        System.out.println("Biaya Semester ini = Rp. "+biaya);
        }
        else{
        System.out.println("Jumlah SKS lebih dari 24");
        }
    }
}

else{
System.out.println("inputan anda salah");
}
    
    }}
