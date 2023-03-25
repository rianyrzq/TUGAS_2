/*
NIM		: 13020210088
Nama		: Riany Rezeqy Utamie
Hari/Tanggal	: Senin, 20 Maret 2023
Waktu Pengerjaan: 11.47
*/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import javax.swing.*; 
public class BacaString {

	public static void main(String[] args) throws IOException {
 
		String str;
		BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.print ("\nBaca String dan Integer : \n"); 
		System.out.print("Masukkan Sebuah String : ");
		str= datAIn.readLine();
		System.out.print ("String Yang Dibaca : "+ str);
	}
}