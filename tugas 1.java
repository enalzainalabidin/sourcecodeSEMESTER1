import java.util.Scanner;

public class KonversiNilaiHuruf {
    public static void main(String[] args) {
        // Membaca input nilai huruf dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf: ");
        String nilaiHuruf = scanner.next();
        
        double nilaiAngka;
		
        switch (nilaiHuruf) {
            case "A":
                nilaiAngka = 4.0;
                break;
            case "B":
                nilaiAngka = 3.0;
                break;
            case "C":
                nilaiAngka = 2.0;
                break;
            case "D":
                nilaiAngka = 1.0;
                break;
            case "E":
                nilaiAngka = 0.0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                return; 
        }
        System.out.println("Hasil konversi: " + nilaiAngka);
    }
}