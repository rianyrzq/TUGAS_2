/*
NIM		: 13020210088
Nama		: Riany Rezeqy Utamie
Hari/Tanggal	: Selasa, 21 Maret 2023
Waktu Pengerjaan: 10.25
*/

import java.util.Scanner;
/* Baca N, Print i = 1 s/d N dengan WHILE */
public class PrintWhile {
    public static void main(String[] args) {
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Nilai N > 0 = "); 
        N = masukan.nextInt();
        i = 1; /* First Elmt */
        System.out.print ("Print i dengan WHILE: \n");
        while (i <= N){ 
            System.out.println (i);
            i++;
        };     
     }
}