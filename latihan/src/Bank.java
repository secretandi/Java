package src;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ProgramKasir {
    // Output yang telah dicetak ke layar
    private static String outputLayar = "";

    // Method untuk membersihkan layar output
    public static void clearOutput() {
        outputLayar = "";
    }

    // Method untuk menampilkan tanggal transaksi
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    // Method untuk mencetak output ke layar
    public static void printToScreen(String text) {
        outputLayar += text + "\n";
        System.out.println(text);
    }

    public static void main(String[] args) {
        // Contoh penggunaan method
        printToScreen("Transaksi dimulai pada: " + getCurrentDate());
        printToScreen("Barang 1 dibeli.");
        printToScreen("Barang 2 dibeli.");
        printToScreen("Total harga: $50");

        clearOutput();

        printToScreen("Transaksi baru dimulai pada: " + getCurrentDate());
        printToScreen("Barang 3 dibeli.");
        printToScreen("Total harga: $30");
    }
}
