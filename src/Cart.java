import java.util.ArrayList;

public class Cart {
    private ArrayList<Produk> listProduk;

    public Cart() {
        this.listProduk = new ArrayList<>();
    }

    private Produk getProdukByKode(String kodeProduk) {
        for (Produk produk: listProduk) {
            if (produk.getKodeProduk().equals(kodeProduk)) {
                return produk;
            }
        }
        return  null;
    }

    public void tambahProduk(String kodeProduk, int kuantitas) {
        Produk produk = getProdukByKode(kodeProduk);
        if (produk != null) {
            produk.setKuantitas(produk.getKuantitas() + kuantitas);
        } else {
            produk = new Produk(kodeProduk, kuantitas);
            listProduk.add(produk);
        }
    }

    public void hapusProduk(String kodeProduk) {
        Produk produk = getProdukByKode(kodeProduk);
        listProduk.remove(produk);
    }

    public void tampilkanCart() {
        for (Produk produk: listProduk) {
            System.out.println(produk.toString());
        }
    }
}
