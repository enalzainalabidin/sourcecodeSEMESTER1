import java.util.Scanner;

public class luasPersegiPanjang02 {
	public static void main(String[] args) {
		//your code goes here
		Scanner scanner = new Scanner(System.in);
		System.out.println("P = ");
		int Le = scanner.nextInt();
		
		System.out.println("Le = ");
		int P = scanner.nextInt();
		
		int Lu = P * Le;
		int K = (Le + P) * 2;
		
		System.out.println("Lu = ");
		System.out.println(Lu);
		System.out.println("K = ");
		System.out.println(K);
	}
}