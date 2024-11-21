package pekan6;

import java.util.Scanner;

public class perulanganWhile1 {

	public static void main(String[] args) {
		
		int counter=0;
		String jawab;
		boolean running = true;
				
		Scanner scan = new Scanner (System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah =" +counter);
			System.out.println("Apakah lanjut (ya/tidak)?");
			jawab= scan.nextLine ();
			
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
		}
		System.out.println("Anda Melakuan Perulangan Sebanyak"+counter+ "kali");
	}

}
