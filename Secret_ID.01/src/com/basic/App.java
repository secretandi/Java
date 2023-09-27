package com.basic;

public class App {

    public static void main(String[] args) {

        clearConsole();
        System.out.println();

        // Pemanggilan
        Basic.basic17();
        // Experience.experience_15();
        // Experience.test06();

        System.out.println();
        System.out.println();
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Tulis kode program Anda di bawah ini
        System.out.println("Ini adalah contoh output setelah membersihkan konsol.");
    }

    // public static void display(String title, double luas) {

    // System.out.println("\n\n========= " + title + " =========\n");
    // System.out.println(title + " = " + luas);
    // System.out.println("\n");
    // }
}