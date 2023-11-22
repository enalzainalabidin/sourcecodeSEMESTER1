import java.util.HashMap;
import java.util.Map;

public class BelanjaApp {
    public static void main(String[] args) {
        Map<String, Integer> belanja = new HashMap<>();
        belanja.put("item-0", 2);
        belanja.put("item-1", 1);
        belanja.put("item-2", 3);
        belanja.put("item-3", 0);
        belanja.put("item-4", 3);

        Map<String, Integer> hargaBarang = new HashMap<>();
        hargaBarang.put("barang ke-0", 2500);
        hargaBarang.put("barang ke-1", 3000);
        hargaBarang.put("barang ke-2", 4000);
        hargaBarang.put("barang ke-3", 5000);
        hargaBarang.put("barang ke-4", 6000);

        int totalItemBelanja = 9;
        int totalBelanja = 38000;

        for (Map.Entry<String, Integer> entry : belanja.entrySet()) {
            String key = entry.getKey();
            int jumlah = entry.getValue();

            int harga = hargaBarang.getOrDefault(key, 0);

            int totalHarga = harga * jumlah;

            System.out.println("Harga barang " + key + ", " + harga + ", " + jumlah + " item: " + totalHarga);

            totalItemBelanja += jumlah;
            totalBelanja += totalHarga;
        }

        System.out.println("\nTOTAL ITEM BELANJA: " + totalItemBelanja);
        System.out.println("TOTAL BELANJA: RP " + totalBelanja);
    }
}