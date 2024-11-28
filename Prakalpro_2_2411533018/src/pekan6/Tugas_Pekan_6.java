package pekan6;

import java.util.Scanner;
import java.util.Random;

public class Tugas_Pekan_6 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random b = new Random();
		boolean loop = true; 
		String d;
		
		int a1, a2, tebakan,tot,x;
		x=0;
		tebakan = 7;
		
		while(loop== true) {
			x++;
			a1 = b.nextInt(6)+1;
			a2 = b.nextInt(6)+1;
			tot = a1+a2;
			System.out.println(a1 +" + " +a2+ " = " +tot);
			if(tot == tebakan) {
				loop = false;
				System.out.println("kamu menang setelah "+x+" percobaan!");
			}else {
				System.out.println("tebakan kamu salah");
				System.out.print("apa kamu mau lempar dadu lagi? (ya / tidak)");
				d = a.next();
				if(d.equals("ya")) {
					loop= true;
				} else if(d.equals("tidak")) {
					loop = false;
					System.out.println("kamu gagal menang");
				}
			}
		}
		
		
	}

}