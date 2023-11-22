public class DataBelanja {
    public static void main(String[] args) {
        // Data barang
        int[] hargaBarang = {2500, 3000, 4000, 5000, 6000};
        int[] jumlahItem = {2, 1, 3, 0, 3};

        // Menghitung total item dan total belanja
        int totalItem = 0;
        int totalBelanja = 0;

        for (int i = 0; i < hargaBarang.length; i++) {
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
