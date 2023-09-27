package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Experience {

    public static void experience_1() {

        System.out.println("Andi Rahmat Nurdin");
    }

    public static void experience_2() {

        // Empity
    }

    public static void experience_3() {

        System.out.printf("Code:      %d\nName:      Secret_ID\nIdentity:  Unknown", 13);
    }

    public static void experience_4() {

        // Empity
    }

    public static void experience_5() {

        int a = 1, b = 2, c = 3;
        System.out.println("Nilai awal");
        System.out.println("Nilai a = " + a + ", b = " + b + " dan c = " + c);

        a = 10;
        b = 20;
        c = 30;
        System.out.println("\nNilai baru");
        System.out.println("Nilai a = " + a + ", b = " + b + " dan c = " + c);
    }

    public static void experience_6() {

        // Empity
    }

    public static void experience_7() {

        // Empity
    }

    public static void experience_8() {

        int a = 5, b = 2, hasil01 = a * b;
        System.out.println("======= Integer");
        System.out.println("Hasil dari " + a + " * " + b + " = " + hasil01);

        hasil01 = a / b;
        System.out.println("Hasil dari " + a + " * " + b + " = " + hasil01);

        float c = 5, d = 2, hasil02 = c * d;
        System.out.println("\n======= Float");
        System.out.println("Hasil dari " + c + " * " + d + " = " + hasil02);

        hasil02 = c / d;
        System.out.println("Hasil dari " + c + " * " + d + " = " + hasil02);
    }

    public static void experience_9() {

        // Empity
    }

    public static void experience_10() {

        int n = 10;
        System.out.println("Nilai awal dari 'n' adalah " + n + "\n");

        System.out.print("Nilai " + n);
        n += 2;
        System.out.println(" dengan fungsi '+=2' = " + n);

        System.out.print("Nilai " + n);
        n -= 2;
        System.out.println(" dengan fungsi '-=2' = " + n);

        System.out.print("Nilai " + n);
        n *= 2;
        System.out.println(" dengan fungsi '*=2' = " + n);

        System.out.print("Nilai " + n);
        n /= 2;
        System.out.println(" dengan fungsi '/=2' = " + n);

        System.out.print("Nilai " + n);
        n %= 3;
        System.out.println(" dengan fungsi '%=3' = " + n);
    }

    public static void experience_11() {

        // Empity
    }

    public static void experience_12() {

        // Empity
    }

    public static void experience_13() {

        System.out.println("=====  Operator bitwise  =====");
        byte a, b, c, d, e, num1, num2, num3, num4;
        a = 0;
        b = 1;
        c = 2;
        d = 3;
        e = 4;
        String a_bits, b_bits, c_bits, d_bits, e_bits, num1_bits, num2_bits, num3_bits, num4_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        d_bits = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
        System.out.printf("%s = %d \n", d_bits, d);

        e_bits = String.format("%8s", Integer.toBinaryString(e)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", e_bits, e);

        // Operator shift right
        System.out.println("============ Shift Left  << 3");
        num1 = (byte) (a << 3);
        num1_bits = String.format("%8s", Integer.toBinaryString(num1)).replace(' ', '0');
        System.out.printf("%s = %d  << %s = %d \n", a_bits, a, num1_bits, num1);

        num2 = (byte) (b << 3);
        num2_bits = String.format("%8s", Integer.toBinaryString(num2)).replace(' ', '0');
        System.out.printf("%s = %d  << %s = %s \n", b_bits, b, num2_bits, num2);

        num3 = (byte) (c << 3);
        num3_bits = String.format("%8s", Integer.toBinaryString(num3)).replace(' ', '0');
        System.out.printf("%s = %d  << %s = %d \n\n", c_bits, c, num3_bits, num3);

        // Operator shift left
        System.out.println("============ Shift Right >> 2");
        num4 = (byte) (num1 >> 2);
        num4_bits = String.format("%8s", Integer.toBinaryString(num4)).replace(' ', '0');
        System.out.printf("%s = %d  >> %s = %d \n", num1_bits, num1, num4_bits, num4);

        num4 = (byte) (num2 >> 2);
        num4_bits = String.format("%8s", Integer.toBinaryString(num4)).replace(' ', '0');
        System.out.printf("%s = %d  >> %s = %s \n", num2_bits, num2, num4_bits, num4);

        num4 = (byte) (num3 >> 2);
        num4_bits = String.format("%8s", Integer.toBinaryString(num4)).replace(' ', '0');
        System.out.printf("%s = %d >> %s = %d \n\n", num3_bits, num3, num4_bits, num4);

        // Variabel baru
        a = 2;
        b = 4;
        c = 7;

        // Operator bitwise OR
        System.out.println("====== Bitwise OR  (|) ======");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        a_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, b);
        a_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, c);
        System.out.println("---------- OR");
        d = (byte) (a | b | c);
        d_bits = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", d_bits, d);

        // Operator bitwise AND
        System.out.println("====== Bitwise AND (&) ======");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        a_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, b);
        a_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, c);
        System.out.println("---------- AND");
        d = (byte) (a & b & c);
        d_bits = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", d_bits, d);

        // Operator bitwise XOR
        System.out.println("====== Bitwise XOR (^) ======");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        a_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, b);
        a_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, c);
        System.out.println("---------- XOR");
        d = (byte) (a ^ b ^ c);
        d_bits = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", d_bits, d);

        // Operator negasi / NOT
        System.out.println("====== Bitwise NOT (~) ======");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        d = (byte) (~a);
        d_bits = String.format("%8s", Integer.toBinaryString(d).substring(24));
        System.out.printf("%s = %d \n", d_bits, d);
    }

    public static void experience_14() {

        // Mengambil user input (Scanner)
        Scanner user = new Scanner(System.in);

        // Menghitung luas dan keliling persegi
        // Luas = Sisi * sisi
        // Keliling = 4 * Sisi
        System.out.println("## Persegi ##");
        int sisi, luas;
        float keliling;

        System.out.println("======= Luas (Sisi * Sisi)");
        System.out.print("Sisi = ");
        sisi = user.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas = " + luas + "\n");

        System.out.println("======= Keliling (4 * Sisi)");
        keliling = 4 * sisi;
        System.out.println("Keliling = " + keliling + "\n\n");

        // Menghitung luas dan keliling persegi panjang
        // Luas = Panjang * Lebar
        // Keliling = 2 * (PAnjang * Lebar)
        System.out.println("## Persegi Panjang ##");
        int panjang, lebar;

        System.out.println("======= Luas (Panjang * Lebar)");
        System.out.print("panjang = ");
        panjang = user.nextInt();
        System.out.print("Lebar = ");
        lebar = user.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas = " + luas + "\n");

        System.out.println("======= Keliling (2 * (Panjang + Lebar))");
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling = " + keliling + "\n\n");

        // Menghitung luas dan keliling segitiga
        // Luas = 0.5 * Alas * Tinggi
        // Keliling = Panjang AB + Panjang BC + Panjang AC
        System.out.println("## Segitiga ##");
        double alas, tinggi, panjang_AB, panjang_BC, panjang_AC, lusa_segitiga, keliling_segitiga;

        System.out.println("======= Luas (1/2 * Alas * Tinggi)");
        System.out.print("Alas = ");
        alas = user.nextInt();
        System.out.print("Tinggi = ");
        tinggi = user.nextInt();
        lusa_segitiga = (0.5) * (alas * tinggi);
        System.out.println("Luas = " + lusa_segitiga + "\n");

        System.out.println("======= Keliling (Panjang AB + BC + AC)");
        System.out.print("Panjang AB = ");
        panjang_AB = user.nextInt();
        System.out.print("Panjang BC = ");
        panjang_BC = user.nextInt();
        System.out.print("Panjang AC = ");
        panjang_AC = user.nextInt();
        keliling_segitiga = panjang_AB + panjang_BC + panjang_AC;
        System.out.println("Keliling = " + keliling_segitiga + "\n\n");

        // Menghitung luas dan keliling lingkaran
        // Luas = PHI * Jari-jari^2
        // Keliling = PHI * Diameter
        System.out.println("## Lingkaran ##");
        int r, diameter;
        double luas_lingkaran, keliling_lingkaran;
        double phi = 3.14;

        System.out.println("======= Luas (PHI * Jari-jari^2)");
        System.out.print("Jari-jari = ");
        r = user.nextInt();
        luas_lingkaran = phi * (r * r);
        System.out.println("Luas = " + luas_lingkaran + "\n");

        System.out.println("======= Keliling (phi * Diameter)");
        diameter = 2 * r;
        keliling_lingkaran = phi * diameter;
        System.out.println("Keliling = " + keliling_lingkaran);

        user.close();
    }

    public static void experience_15() {

        Scanner user = new Scanner(System.in);

        float angka01, angka02, angka03, angka04, angka05, angka06, angka07, hasil;
        System.out.print("Angka01 = ");
        angka01 = user.nextFloat();
        System.out.print("Angka02 = ");
        angka02 = user.nextFloat();
        System.out.print("Angka03 = ");
        angka03 = user.nextFloat();
        System.out.print("Angka04 = ");
        angka04 = user.nextFloat();
        System.out.print("Angka05 = ");
        angka05 = user.nextFloat();
        System.out.print("Angka06 = ");
        angka06 = user.nextFloat();
        System.out.print("Angka07 = ");
        angka07 = user.nextFloat();

        hasil = angka01 + angka02 * angka03 + (angka04 * (angka05 - angka06) / angka07);
        System.out.println("Hasil dari " + angka01 + " + " + angka02 + " * " + angka03 + " + (" + angka04 + " * ("
                + angka05 + " - " + angka06 + ") / " + angka07 + " = " + hasil);

        user.close();
    }

    public static void experience_16() {

    }

    public static void experience_17() {

        Scanner user = new Scanner(System.in);

        // Statement (percabangan)
        int angka;

        System.out.print("Masukkan nilai: ");
        angka = user.nextInt();

        System.out.println("Nilai = " + angka);

        if (angka == 2) {
            System.out.println("The number is low secret");

        } else if (angka == 4) {
            System.out.println("The number is Medium secret");

        } else if (angka == 7) {
            System.out.println("The number is High secret");

        } else {
            System.out.println("The number is normal");

        }
        System.out.print("Done");

        user.close();
    }

    public static void test01() {

        // Membuat kalimat
        System.out.println("Programming disaster");
        System.out.println("Next program\n");

        // Membuat variabel
        int angka01 = 5;
        System.out.print("Nilai angka01 = " + angka01 + "\n");
        angka01 = 10;
        System.out.println("Nilai perubahan angka01 = " + angka01);

        int angka02;
        angka02 = 20;
        System.out.println("Nilai angka02 = " + angka02);

        // Memanggil sebuah Variabel
        System.out.printf("Nilai angka02 = %d", angka02);
    }

    public static void test02() {

    }

    public static void test03() {

        // If statement
        Scanner user = new Scanner(System.in);
        int ax, bx;

        System.out.print("Masukkan nilai pertama: ");
        ax = user.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        bx = user.nextInt();

        if (ax == 5) {

            if (bx == 5) {
                System.out
                        .println("Angka " + ax + " adalah perkalian 5 dan angka " + bx + " juga merupakan perkalian 5");

            } else {
                System.out.println(
                        "Angka " + ax + " adalah perkalian 5 sedangkan angka " + bx + " tidak termasuk perkalian 5");

            }
        } else if (ax != 10) {

            if (bx == 5) {
                System.out.println("Angka " + ax + " bukan perkalian 5, tetapi angka " + bx + " merupakan perkalian 5");
            } else {
                System.out.println("Angka " + ax + " dan " + bx + " bukan perkalian 5");

            }
            System.out.println("Program berakhir");

        }
        user.close();
    }

    public static void test05() {

        String input;
        Scanner user = new Scanner(System.in);

        System.out.println("==== Verikasi pendataan ====");
        System.out.print("Masukkan data: ");
        input = user.next();

        switch (input) {
            case "Andi":
            case "andi":
                System.out.println("Andi adalah admin");
                break;
            case "Secret":
            case "secret":
                System.out.println("Silahkan masuk");
                break;
            default:
                System.out.println("Kode bermaslah");
        }

        System.out.println("Verifikasi berakhir\n");

        user.close();
    }

    public static void test06() {

        // Ternary operator
        int input, x;

        Scanner user = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        input = user.nextInt();

        x = (input == 10) ? (input * input) : (input / 2);
        System.out.println("Nilai input = " + x);

        user.close();
    }

    public static void test07() {

    }

    public static void experience_101() {

        // int awal, akhir, total;

        // Scanner user = new Scanner(System.in);
        // System.out.print("Masukkan nilai awal : ");
        // awal = user.nextInt();
        // System.out.print("Masukkan nilai akhir : ");
        // akhir = user.nextInt();

        // for (total = awal + akhir; awal <= akhir; awal++) {

        // System.out.println("Ditambah " + awal + " menjadi " + total);
        // }

        // user.close();
    }

    public static void experience_102() {

        int awal, akhir, total;
        boolean test = true;

        Scanner user = new Scanner(System.in);
        System.out.print("Masukkan nilai awal   : ");
        awal = user.nextInt();
        System.out.print("Masukkan nilai akhir  : ");
        akhir = user.nextInt();

        total = 0;
        do {

            if (awal <= akhir) {

                total = total + awal;
                System.out.println("Ditambah " + awal + " menjadi " + total);
                awal++;

                test = true;
            }
        }

        while (test);

        user.close();
    }

    public static void experience_103() {

        System.out.println("======= Segitiga kanan bawah =======\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  ");
                if (i + j == 4) {
                    break;
                }
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }

            }

            System.out.print("\n");
        }

        System.out.println();
        System.out.println("======= Segitiga kanan atas =======\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  ");
                if (i == j) {
                    break;
                }
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i + j == 4) {
                    break;
                }
            }

            System.out.print("\n");
        }

        System.out.println();
        System.out.println("======= Trapesium =======\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  ");
                if (i + j == 2) {
                    break;
                }
            }
            for (int k = 0; k < 3; k++) {
                System.out.print("* ");
                if (i == k) {
                    break;
                }
            }
            for (int l = 0; l < 3; l++) {
                System.out.print("* ");
            }
            for (int m = 0; m < 3; m++) {
                System.out.print("* ");
                if (i == m) {
                    break;
                }
            }

            System.out.print("\n");
        }

        System.out.println();
        System.out.println("======= Jajar genjang =======\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("  ");
                if (i + j == 3) {
                    break;
                }
            }
            for (int k = 0; k < 8; k++) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        System.out.println();
        System.out.println("======= Belah ketupat =======\n");

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("  ");
                if (i + j == 3) {
                    break;
                } else if (j + 3 == i) {
                    break;
                }
            }
            for (int k = 0; k < 7; k++) {
                System.out.print("* ");
                if (i == k) {
                    break;
                } else if (i + k == 6) {
                    break;
                }
            }
            for (int l = 0; l < 5; l++) {
                if (i == l) {
                    break;
                } else if (i + l == 6) {
                    break;
                }
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        // test
        System.out.println("=== Test ===");
        System.out.println("\n");
        int a = 3;
        int b = 2;
        int c = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < a) {
                    System.out.print("  ");
                    a--;
                } else if (j > b) {
                    System.out.print("  ");
                    b++;
                    j++;
                } else if (i >= 3) {
                    if (j < c) {
                        System.out.print("  ");
                        j++;
                        c++;
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void experience_104() {

    }

    public static void experience_105() {

        Scanner user = new Scanner(System.in);

        System.out.println("===== Perhitungan dan Penggambaran =====");
        System.out.print("Panjang: ");
        int panjang = user.nextInt();
        System.out.print("Lebar: ");
        int lebar = user.nextInt();

        System.out.println();

        gambar(panjang, lebar);
        System.out.println();
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("Keliling = " + keliling(panjang, lebar));

        user.close();
    }

    private static int luas(int panjang, int lebar) {

        System.out.println("Luas = Panjang(" + panjang + ") * Lebar(" + lebar + ")");
        int hasil = panjang * lebar;
        return hasil;
    }

    private static int keliling(int panjang, int lebar) {

        System.out.println("Keliling = (Panjang(" + panjang + ") + Lebar(" + lebar + ")) * " + 2);
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static void gambar(int panjang, int lebar) {

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {

                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void experience_106() {

        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = data.nextInt();
        System.out.println();

        Object[] arrayAngka = new Object[n];

        // Pada huruf 'n' juga dapat digantikan dengan 'arrayAngka.length' sesuai dengan
        // variabel array
        for (int i = 0; i < n; i++) {

            System.out.print("Index ke " + i + " adalah ");
            arrayAngka[i] = data.nextInt();
        }

        Arrays.sort(arrayAngka);

        System.out.println("\nHasil inputan tipe data dari sebuah array");
        System.out.println(Arrays.toString(arrayAngka));

        data.close();
    }
}