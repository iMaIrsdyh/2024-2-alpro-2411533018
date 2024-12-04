package pekan7;

public class Mahasiswa {
	private int nim ;
	private String nama,nim2;
	
	public void setNim(int x) {
		this.nim = x;
	}
	public void setnim2(String nim2) {
		this.nim2= nim2;
	}
	public void setnama(String nama) {
		this.nama= nama;
	}
	public int getnim() {
		return nim;
	}
	public String getname() {
		return nama;
	}
	
	public void cetak() {
		System.out.println("Nim "+nim);
		System.out.println("Nama "+nama);
		
	}
	public void cetak2() {
		System.out.println("Nim  "+nim2);
		System.out.println("Nama "+nama);
		
	}
}