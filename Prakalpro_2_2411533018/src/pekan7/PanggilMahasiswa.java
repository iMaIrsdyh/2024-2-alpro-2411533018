package pekan7;

public class PanggilMahasiswa {
	public static void main(String[] args) {
		Mahasiswa a= new Mahasiswa();
		a.setNim(23532);
		a.setnama("Rahmat");
		System.out.println(a.getnim());
		System.out.println(a.getname());
		a.cetak();
	}
}