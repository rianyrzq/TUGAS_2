/*
NIM		: 13020210088
Nama		: Riany Rezeqy Utamie
Hari/Tanggal	: Senin, 20 Maret 2023
Waktu Pengerjaan: 12.20
*/

/* Contoh pemakaian IF satu kasus */
/* Membaca nilai integer, menuliskan nilainya jika positif */ 

import java.util.Scanner;
public class If1 {

	public static void main(String[] args) {

		Scanner masukan=new Scanner(System.in); 
		int a;

		System.out.print ("Contoh IF satu kasus \n"); 
		System.out.print ("Ketikkan suatu nilai integer : "); 
		a = masukan.nextInt();
		if (a >= 0)
		System.out.print ("\nNilai a positif "+ a);
	}
}