public class bilanganTerbesar {
	public static void main(String [] args) {
		double x1 = 8.5, x2 = 11, x3 = 3.4;
		
		if(x2 >= x1 && x1 >= x3)
			System.out.println(x1 + " adalah angka terbesar.");

		else if(x2 >= x1 && x2 >=x3)
			System.out.println(x2 + " adalah angka terbesar.");
		
		else
			System.out.println(x3 + " adalah angka terbesar.");
	}
}