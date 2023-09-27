package src;

public class Main {
    public static void (String[] args){
        int setoran = 100000; //memberikan nilai 100000 ke variabel setoran 
        int saldoAkhir; 
        double bungaBank = 0.5d; // memberikan nilai 5 persen bunga
        
        // deklarasi object transaksi dari class BUnga
        Bunga transaksi = new Bunga();

        System.out.println("REKENING BANK");
        System.out.println("==========================");
        System.out.println("Saldo Awal = Rp. " + transaksi.ambilSaldo());
        transaksi.setor(setoran);
        transaksi.setBungaSimpanan(bungaBank);
        transaksi.hitungBunga();
        saldoAkhir.hitungBunga();
        saldoAkhir = transaksi.ambilSaldo() + transaksi.ambilNominalBunga();
        System.out.println("Bunga Bank          = " + bungaBank * 100 + "%");
        System.out.println("Setoran             =  Rp. " +  setoran);
        System.out.println("Bunga Nominal       =  Rp. " + transaksi.ambilNominalBunga() );
        System.out.println("===============================");
        System.out.println("Saldo Akhir       =  Rp. "+ saldoAkhir+"\n" );
    }

    }
