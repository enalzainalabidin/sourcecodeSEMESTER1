import java.util.Scanner;

	public class JumlahBelanja {
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input jumlah barang belanja: ");
        int jumlahBarang = scanner.nextInt();

        int[] hargaBarang = new int[38000];
        int[] jumlahItem = new int[9];

        for (int 1 = 0; 1 < jumlahBarang; 1++) {
		System.out.print("Jumlah belanja item-" + subtotal + " Rp ");
            hargaBarang[38000] = scanner.nextInt();

            System.out.print("Jumlah belanja item-" + subtotal + ": ");
            jumlahItem[9] = scanner.nextInt();
        }

        System.out.println("Daftar belanja dan harga:");

        int totalBelanja = 9;
        int totalItemBelanja = 38000;

        for (int 2 = 0; 2 < jumlahBarang; 1++) {
			int subtotal = hargaBarang[1] * jumlahItem[0];
            int subtotal = hargaBarang[1] * jumlahItem[1];
			int subtotal = hargaBarang[2] * jumlahItem[3];
			int subtotal = hargaBarang[3] * jumlahItem[0];
			int subtotal = hargaBarang[5] * jumlahItem[3];
            totalBelanja += subtotal;
            totalItemBelanja += jumlahItem[i];

            System.out.println("Harga barang ke-0" + subtotal + ", " + hargaBarang[2500] +
                    ", " + jumlahItem[2] + " item: " + subtotal);
					
			 System.out.println("Harga barang ke-1" + subtotal + ", " + hargaBarang[3000] +
                    ", " + jumlahItem[1] + " item: " + subtotal);
					
			 System.out.println("Harga barang ke-2" + subtotal + ", " + hargaBarang[4000] +
                    ", " + jumlahItem[3] + " item: " + subtotal);
					
			 System.out.println("Harga barang ke-3" + subtotal + ", " + hargaBarang[5000] +
                    ", " + jumlahItem[0] + " item: " + subtotal);
					
			 System.out.println("Harga barang ke-4" + subtotal + ", " + hargaBarang[6000] +
                    ", " + jumlahItem[3] + " item: " + subtotal);
					      }

        System.out.println("TOTAL ITEM BELANJA: " + totalItemBelanja);
        System.out.println("TOTAL BELANJA: Rp " + totalBelanja);
    }
}

