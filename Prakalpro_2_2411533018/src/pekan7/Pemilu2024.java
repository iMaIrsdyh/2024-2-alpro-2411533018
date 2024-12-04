package pekan7;

import java.util.Scanner;

public class Pemilu2024 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nama:");
		String nama=in.nextLine();
		System.out.println("Umur:");
		int umur = in.nextInt();
		System.out.println("Inpurkan Pilihan Anda (1-3): ");
		int n = in.nextInt();
		System.out.println();
		System.out.println("Nama: " + nama);
		System.out.println("Umur: " + umur);
		System.out.println("Pilihan:" + n);
		switch(n) {
		case 1:
			System.out.println("Anda Nyobolos Anies");
			break;
		case 2:
			System.out.println("Anda Nyoblos Prabowo");
			break;
		case 3:
			System.out.println("Anda Nyoblos Ganjar");
			break;
		default:
			System.out.println("Pilihan anda bukuan antara nomer 1 sampai 3");
		}
		System.out.println("Terimakasih ga golput");
	}

}
