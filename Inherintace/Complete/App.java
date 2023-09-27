public class App {
    public static void main(String[] args) {

        // Mobil mobil = new Mobil("Acer", "Supreme", 2000, 50000);
        // mobil.displayInfo();

        Avanza avanza = new Avanza("Toyota", "Avanza", 2022, 20000.0, "Merah", 7);
        avanza.displayInfo();
    }
}

// Class dasar (base class) Mobil
class Mobil {
    
    private String merek;
    private String model;
    private int tahunProduksi;
    private double harga;

    public Mobil(String merek, String model, int tahunProduksi, double harga) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: $" + harga);
    }
}

// Class turunan (derived class) Avanza
class Avanza extends Mobil {
    private int kapasitasPenumpang;
    private String warna;
    private int kecepatan = 180;

    public Avanza(String merek, String model, int tahunProduksi, double harga, String warna,
            int kapasitasPenumpang) {
        super(merek, model, tahunProduksi, harga);
        this.warna = warna;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil metode displayInfo dari class Mobil
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + " orang");
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + this.getKecepatan() + " KM / Perjam");
    }
}