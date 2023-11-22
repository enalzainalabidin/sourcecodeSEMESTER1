import java.util.Scanner;

public class BelanjaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input jumlah barang belanja: ");
        int jumlahBarang = scanner.nextInt();

        int[] hargaBarang = new int[jumlahBarang];
        int[] jumlahItem = new int[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Jumlah belanja item-" + i + " Rp ");
            hargaBarang[i] = scanner.nextInt();

            System.out.print("Jumlah belanja item-" + i + ": ");
            jumlahItem[i] = scanner.nextInt();
        }
		System.out.println("Daftar belanja dan harga:");

        int totalBelanja = 0;
        int totalItemBelanja = 0;

        for (int i = 0; i < jumlahBarang; i++) {
            int subtotal = hargaBarang[i] * jumlahItem[i];
            totalBelanja += subtotal;
            totalItemBelanja += jumlahItem[i];

            System.out.println("Harga barang ke-" + i + ", " + hargaBarang[i] +
                    ", " + jumlahItem[i] + " item: " + subtotal);
        }

        System.out.println("TOTAL ITEM BELANJA: " + totalItemBelanja);
        System.out.println("TOTAL BELANJA: Rp " + totalBelanja);
    }
}