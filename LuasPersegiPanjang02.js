import java.util.scanner;

public class luasPersegiPanjang02 {
	public static void main(String[] args) {
		scanner scanner = new scanner(System.in);
		System.out.println('P = ');
		int Le = scanner.nextint();
		
		System.out.println('Le = ');
		int P = scanner.nextint();
		
		int Lu = P * Le;
		int K = (Le + P) * 2;
		
		System.out.println('Lu = ');
		System.out.println(Lu);
		System.out.println('K = ');
		System.out.println(K);
	}
}