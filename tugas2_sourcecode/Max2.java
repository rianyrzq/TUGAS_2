/*
NIM		: 13020210088
Nama		: Riany Rezeqy Utamie
Hari/Tanggal	: Senin, 20 Maret 2023
Waktu Pengerjaan: 14.29
*/

import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */

public class Max2 {

   public static void main(String[] args) {
       int a, b;
       Scanner masukan=new Scanner(System.in);
       System.out.print ("Maksimum dua bilangan : \n");
       System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
       a=masukan.nextInt();
       b=masukan.nextInt();
       System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
       if (a >= b) {
           System.out.println ("Nilai a yang maksimum : "+ a);
       }else {
           System.out.println ("Nilai b yang maksimum : "+ b);
       }
   }
}
