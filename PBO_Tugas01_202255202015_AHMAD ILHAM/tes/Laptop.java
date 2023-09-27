class Laptop {
    String merek;
    String model;
    int tahunProduksi;

    public void infoLaptop() {
        System.out.println("\nMerek: " + merek +
                "\nModel: " + model + " 5" +
                "\nTahun Produksi: " + tahunProduksi +"\n");
    }
}

class LaptopGaming extends Laptop {
    String processor;
    int kapasitasRAM;
    int harga;

    public void infoLaptopGaming() {
       System.out.println("Merek: " + merek +
                "\nModel: " + model + " 5"+ 
                "\nProcessor: " + processor + "7" +
                "\nKapasitas RAM: " + kapasitasRAM + "GB" +
                "\nHarga: Rp " + harga + " Jt" + "\n");
    }
}

class Main {
    public static void main(String[] args) {
        LaptopGaming laptopGaming = new LaptopGaming();
        laptopGaming.merek = "acer";
        laptopGaming.model = "Nitro";
        laptopGaming.tahunProduksi = 2022;
        laptopGaming.processor = "Intel Core i";
        laptopGaming.kapasitasRAM = 16;
        laptopGaming.harga = 18;

        laptopGaming.infoLaptop();
        laptopGaming.infoLaptopGaming(); 
    }
}

