/*
NIM		: 13020210088
Nama		: Riany Rezeqy Utamie
Hari/Tanggal	: Senin, 20 Maret 2023
Waktu Pengerjaan: 14.47
*/

import java.util.Scanner;
/* Baca N, Print 1 s/d N dengan FOR */

public class PriFor {

   public static void main(String[] args) {
       int i,N;
       Scanner masukan=new Scanner(System.in);
       System.out.println ("Baca N, print 1 s/d N ");
       System.out.print ("N = ");
       N=masukan.nextInt();
       for (i = 1; i <= N; i++){
           System.out.println (i); };
           System.out.println ("Akhir program \n");
   }
}
