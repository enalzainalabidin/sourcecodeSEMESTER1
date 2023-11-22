import java.util.Scanner;

public class ArrayProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Jumlah data: ");
        int jumlahData = scanner.nextInt();

        // Inisialisasi array
        int[] data = new int[jumlahData];

        // Input data
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + i + ": ");
            data[i] = scanner.nextInt();
        }

        // Menampilkan data dan menghitung total penjumlahan
        int total = 0;
        System.out.println("\nMenampilkan data");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + " -› ");
            if (data[i] % 2 == 0) {
                System.out.println("GENAP");
            } else {
                System.out.println("GANJIL");
            }
            total += data[i];
        }

        // Menampilkan total penjumlahan dan rata-rata
        double rataRata = (double) total / jumlahData;
        System.out.println("\nTOTAL PENJUMLAHAN: " + total);
        System.out.println("Rata rata: " + rataRata);
    }
}