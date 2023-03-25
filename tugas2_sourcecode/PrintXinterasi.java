/*
NIM		: 13020210088
Nama		: Riany Rezeqy Utamie
Hari/Tanggal	: Selasa, 21 Maret 2023
Waktu Pengerjaan: 11.02
*/

import java.util.Scanner;
/* contoh baca nilai x */
/* Jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXinterasi {
   public static void main(String[] args) {
        int Sum=0; 
        int x;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();
        if (x == 999){
            System.out.print ("Kasus kosong \n");
        }else{
            Sum = x;
            for (;;){
                System.out.print ("Masukkan nilai x (int),akhiri dg 999 : ");
                x = masukan.nextInt(); 
                if(x==999)
                    break;
                else{
                    Sum = Sum + x;
                }
            }
        }
        System.out.println("Hasil penjumlahan = "+ Sum);
   }
}