import java.util.Scanner;

public class BelanjaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input untuk jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = scanner.nextInt();

        // Inisialisasi array untuk harga dan jumlah item
        int[] hargaBarang = new int[jumlahBarang];
        int[] jumlahItem = new int[jumlahBarang];

        // Meminta input untuk setiap barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Masukkan data untuk barang ke-" + i + ":");
            System.out.print("Harga barang: ");
            hargaBarang[i] = scanner.nextInt();

            System.out.print("Jumlah item: ");
            jumlahItem[i] = scanner.nextInt();
        }

        scanner.close(); // Menutup scanner setelah selesai mengambil input

        // Menghitung total item dan total belanja
        int totalItem = 0;
        int totalBelanja = 0;

        // Menampilkan rincian belanja
        for (int i = 0; i < jumlahBarang; i++) {
            int subtotal = hargaBarang[i] * jumlahItem[i];
            totalItem += jumlahItem[i];
            totalBelanja += subtotal;

            System.out.println("Harga barang ke-" + i + ": " + hargaBarang[i] +
                    ", " + jumlahItem[i] + " item: " + subtotal);
        }

        // Menampilkan total item dan total belanja
        System.out.println("\nTOTAL ITEM BELANJA: " + totalItem);
        System.out.println("TOTAL BELANJA: RP " + totalBelanja);
    }
}
