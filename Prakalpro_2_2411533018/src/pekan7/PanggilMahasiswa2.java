package pekan7;
import java.util.Scanner;

public class PanggilMahasiswa2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Nim ");
		int x = a.nextInt();
		System.out.print("Nama ");
		String y = a.next();
		Mahasiswa b = new Mahasiswa();
		b.setNim(x);
		b.setnama(y);
		System.out.println(b.getnim());
		System.out.println(b.getname());
		b.cetak();
		a.close();
	}

}