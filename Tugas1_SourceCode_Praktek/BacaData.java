/*NIM :13020210127
  Nama:Nadya Nabila Wahyuputri
  Hari/Tanggal : Kamis, 9 Maret 2023
  Waktu pengerjaan :14.30
*/

import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
 public class BacaData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int a;
		Scanner masukan;
		/* Program */
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); /* coba ketik : 
		masukan.nextInt(); 
Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+ a);
	}
}
