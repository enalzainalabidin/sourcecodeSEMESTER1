public class perhitungan {
	int nilai;
	void hitung () {
		nilai = 15+33;
		System.out.println("Hasil = " + nilai);
	}
	public static void main(String[] args) {
		perhitungan objek = new perhitungan();
		objek.hitung();
	}
}