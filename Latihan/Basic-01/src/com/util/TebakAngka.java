package com.util;

import java.util.Random;
import java.util.Scanner;

public class TebakAngka {

    public static void tebakAngka() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int batasAtas = 10; // Batas atas angka acak
        int angkaAcak = random.nextInt(batasAtas) + 1; // Menghasilkan angka acak antara 1 dan batasAtas
        int tebakan;
        int nyawa = 3;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Angka acak telah dibuat antara 1 dan " + batasAtas + ".");
        System.out.println("Anda memiliki 3 nyawa. Mulai tebakannya!");

        while (nyawa > 0) {
            System.out.print("Tebakan Anda: ");
            tebakan = scanner.nextInt();

            if (tebakan > angkaAcak) {
                System.out.println("Tebakan Anda terlalu tinggi!");
                nyawa--;
            } else if (tebakan < angkaAcak) {
                System.out.println("Tebakan Anda terlalu rendah!");
                nyawa--;
            } else {
                System.out.println("Selamat! Anda menebak dengan benar!");
                break;
            }
            System.out.println("Nyawa yang tersisa: " + nyawa);
        }
        if (nyawa == 0) {
            System.out.println("Anda kehabisan nyawa. Angka yang benar adalah: " + angkaAcak);
        }

        System.out.println("Terima kasih telah bermain!");

        scanner.close();
    }
    
}
