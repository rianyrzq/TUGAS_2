/*
NIM		: 13020210088
Nama		: Riany Rezeqy Utamie
Hari/Tanggal	: Senin, 20 Maret 2023
Waktu Pengerjaan: 12.42
*/

import java.util.Scanner;
/* contoh pemakaian IF dua kasus komplementer */
/* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >=0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

public class If2 {

    public static void main(String[] args) {
        int a;
        Scanner masukan = new Scanner(System.in);
        System.out.print ("contoh If dua kasus\n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a=masukan.nextInt();
        
        if(a>=0){
            System.out.println ("Niali a Positif " +a);
        }else/*a<0*/
        {
            System.out.println ("Nilai a Negatif " +a);
        }
        
    }
    
}

