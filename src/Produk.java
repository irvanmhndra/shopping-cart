public class Produk {
    private String kodeProduk;
    private int kuantitas;

    public Produk(String kodeProduk, int kuantitas) {
        this.kodeProduk = kodeProduk;
        this.kuantitas = kuantitas;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    @Override
    public String toString() {
        return kodeProduk + " (" + kuantitas + ")";
    }
}
