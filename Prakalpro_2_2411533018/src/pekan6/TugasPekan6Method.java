package pekan6;
import java.util.Scanner;
import java.util.Random;
public class TugasPekan6Method {
	public static void main(String[] args) {
		loop();
		
	}
	public static void loop() {
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
				System.out.println("Anda Gagal Menang "+x+" Percobaan!");
			}else {
				System.out.println("Tebakan Kamu Salah ");
				System.out.print("Mau Lempar Dadu Lagi? (Ya / Ndak)");
				d = a.next();
				if(d.equals("Ya")) {
					loop= true;
				} else if(d.equals("Tidak")) {
					loop = false;
					System.out.println("Kamu Gagal Menang");
				}
			}
		}
		
	}
}