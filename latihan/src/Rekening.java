package src;

class Rekening {
    protected int saldo; // deklarasi variabel saldo

    public int ambilSaldo() {
        return saldo; // mengembalikan nilaio variabel saldo
    }

    // setter method untuk menambahklan saldo dengan jumlah setoran
    public int setor(int jumlahSetor) {
        if (jumlahSetor > 0) { // jika nilai jumlahSetor lebih dari 0
            this.saldo += jumlahSetor; // tambahkan ke saldo
        }
        return 0;
    }
}