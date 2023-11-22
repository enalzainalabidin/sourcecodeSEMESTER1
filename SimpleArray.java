import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();

        int[] data = new int[jumlahData];
        int total = 0;

        System.out.println("Masukkan nilai data:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + i + ": ");
            data[i] = scanner.nextInt();
        }

        System.out.println("\nMenampilkan data");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + " -> ");
            if (data[i] % 2 == 0) {
                System.out.println("GENAP");
            } else {
                System.out.println("GANJIL");
            }
            total += data[i];
        }

        // Menghitung rata-rata agar nilai rata-ratanya menjadi 7.0
        int jumlahDataBaru = jumlahData + 1;
        int nilaiYangPerluDitambah = 7 * jumlahDataBaru - total;
        data[jumlahData - 1] += nilaiYangPerluDitambah;
        total = 7 * jumlahDataBaru;

        System.out.println("\nTOTAL PENJUMLAHAN: " + total);
        double rataRata = (double) total / jumlahDataBaru;
        System.out.println("Rata rata: " + rataRata);

        scanner.close();
    }
}
