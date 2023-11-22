import java.util.Scanner;

public class KodeNegaraConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode negara (2 huruf): ");
        String kode = scanner.next();

        String namaNegara;

        if (kode.equals("ES")) {
            namaNegara = "Spain";
        } else if (kode.equals("TN")) {
            namaNegara = "TUNISIA";
        } else if (kode.equals("ID")) {
            namaNegara = "INDONESIA";
        } else if (kode.equals("MM")) {
            namaNegara = "Myanmar";
        } else if (kode.equals("IN")) {
            namaNegara = "INDIA";
        } else {
            namaNegara = "TIDAK DIKETAHUI";
        }

        System.out.println("Kode: " + kode);
        System.out.println("Nama Negara: " + namaNegara);
    }
}
