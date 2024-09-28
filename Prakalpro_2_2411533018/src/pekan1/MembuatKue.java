package pekan1;

public class MembuatKue {
	public static void main(String[] args) {
		makeBetter();
		memanggang();
		memanggang();
		menghias();}
		
		//langkah 1: Buat adonan kue.
		public static void makeBetter() {
			System.out.println("Campur bahan kering");
			System.out.println("kirim mentega dan gula");
			System.out.println("kocok telurnya");
            System.out.println("Masukkan bahan kering.");		
		}
		//langkah 2: Panggang sekumpulan kue.
		public static void memanggang() {
			System.out.println("Setel suhu oven");
			System.out.println("Setel pengatur waktu.");
			System.out.println("Masukkan kue ke dalam oven");
			System.out.println("Biarkan cookie untuk dipanggang");
	}
		//langkah 3: Hiasi cookie.
		public static void menghias() { 
			System.out.println("Campur bahan untuk forsting.");
			System.out.println("Campur frosting dan taburan");
		}
}