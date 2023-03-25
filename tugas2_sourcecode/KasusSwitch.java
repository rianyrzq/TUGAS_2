/*
NIM		: 13020210088
Nama		: Riany Rezeqy Utamie
Hari/Tanggal	: Senin, 20 Maret 2023
Waktu Pengerjaan: 13.41
*/
/*Ekspresi Kondisional Dengan Boolean*/

import java.util.Scanner;

public class KasusSwitch {

   public static void main(String[] args) {
       char cc;
       Scanner masukan=new Scanner(System.in);
       System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n"); 
       cc=masukan.next().charAt(0);
       switch (cc) {
           case 'a':{ 
               System.out.print (" Yang Anda Ketik Adalah a\n"); 
           break;}
           case 'u':{ 
               System.out.print (" Yang Anda Ketik Adalah u\n"); 
           break;}
           case 'e':{ System.out.print (" Yang Anda Ketik Adalah e\n"); 
           break;}
           case 'i':{ 
               System.out.print (" Yang Anda Ketik Adalah i\n"); 
           break;}
           case 'o':{ 
               System.out.print (" Yang Anda Ketik Adalah o\n"); 
           break;}
           default:
               System.out.print (" Yang Anda Ketik Adalah huruf mati\n");
       }
   }
}
