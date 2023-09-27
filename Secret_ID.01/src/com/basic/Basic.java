package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {

    public static void basic1() {

        System.out.print("Andra");
    }

    public static void basic2() {

        // Folder
    }

    public static void basic3() {

        // Pengenalan print dan alur eksekusi

        // Println
        System.out.println("Low user");
        System.out.println("Medium user");
        System.out.println("Hard user");

        System.out.println();

        // \n
        System.out.print("Low user\n");
        System.out.print("Medium user\n");
        System.out.print("Hard user\n");

        System.out.println();

        // Tidak menggunakan ln maupun \n
        System.out.print("Other ");
        System.out.print("dimension");

        System.out.println("\n");

        // Printf untuk tambahan tipe data int
        System.out.printf("Angka %d", 2);
    }

    public static void basic4() {

        // String[] args
    }

    public static void basic5() {

        // Tipe data dan Variabel
        int a = 10; // Assignment
        System.out.println("Nilai a = " + a);

        a = 20;
        System.out.println("Nilai a baru = " + a);

        // Deklarasi
        int b;
        b = 10;
        System.out.println("Nilai b = " + b);
    }

    public static void basic6() {

        // Tipe data pada java
        // Integer, byte, short, long, double, float, char, boolean

        // Integer (satuan)
        int i = 10;
        System.out.println("======= Integer");
        System.out.println("Nilai integer = " + (i + 1));
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit\n");

        // Byte (satuan)
        byte b = 10;
        System.out.println("======= Byte");
        System.out.println("Nilai byte = " + b);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " bit\n");

        // Short (satuan)
        short s = 10;
        System.out.println("======= Short");
        System.out.println("Nilai short = " + s);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        System.out.println("Besar short = " + Short.SIZE + " bit\n");

        // Long (satuan)
        long l = 10L;
        System.out.println("======= Long");
        System.out.println("Nilai long = " + l);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        System.out.println("Besar long = " + Long.SIZE + " bit\n");

        // Double (koma, bilangan real)
        double d = -10.5D;
        System.out.println("======= Double");
        System.out.println("Nilai double = " + d);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        System.out.println("Besar double = " + Double.SIZE + " bit\n");

        // Float (koma, bilangan real)
        float f = -10.5F;
        System.out.println("======= Float");
        System.out.println("Nilai float = " + f);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float = " + Float.SIZE + " bit\n");

        // Char (koma, bilangan real) berdasarkan ASCII
        char c = 10;
        System.out.println("======= Character");
        System.out.println("Nilai char = " + c);
        System.out.println("Nilai min = " + Character.MIN_VALUE);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Besar char = " + Character.BYTES + " bytes");
        System.out.println("Besar char = " + Character.SIZE + " bit\n");

        // Boolean (True/False)
        boolean bool = false;
        System.out.println("======= Boolean");
        System.out.println("Nilai boolean = " + bool);
        System.out.println("Nilai true = " + Boolean.TRUE);
        System.out.println("Nilai fales = " + Boolean.FALSE);
    }

    public static void basic7() {

        // Operasi aritmatika
        int angka01 = 10;
        int angka02 = 20;
        System.out.println("<<< Tipe data Integer >>>");
        System.out.print("Nilai angka01 = " + angka01 + "\nNilai angka02 = " + angka02 + "\n\n");

        // Penjumlahan
        int angka03 = angka01 + angka02;
        System.out.println("======= Penjumlahan");
        System.out.println("Nilai angka01 + angka02 = " + angka03);
        System.out.printf("Nilai angka01 + angka02 = %d\n\n", angka03);

        // Pengurangan
        angka03 = angka02 - angka01;
        System.out.println("======= Pengurangan");
        System.out.println("Nilai angka02 - angka01 = " + angka03);
        System.out.printf("Nilai angka02 - angka01 = %d\n\n", angka03);

        // Perkalian
        angka03 = angka01 * angka02;
        System.out.println("======= Perkalian");
        System.out.println("Nilai angka01 - angka02 = " + angka03);
        System.out.printf("Nilai angka01 - angka02 = %d\n\n", angka03);

        // Pembagian
        angka03 = angka02 / angka01;
        System.out.println("======= Pembagian");
        System.out.println("Nilai angka02 : angka01 = " + angka03);
        System.out.printf("Nilai angka02 : angka01 = %d\n\n\n", angka03);

        float angka04;
        float angka05 = 10;
        float angka06 = 15;
        System.out.println("<<< Tipe data Float >>>");
        System.out.print("Nilai angka05 = " + angka05 + "\nNilai angka06 = " + angka06 + "\n\n");

        // Pembagian
        angka04 = angka06 / angka05;
        System.out.println("======= Pembagian");
        System.out.println("Nilai angka06 : angka05 = " + angka04 + "\n");

        // Modulus (Hasil sisa bagi)
        angka04 = angka06 % angka05;
        System.out.println("======= Modulus");
        System.out.println("Nilai angka06 % angka05 = " + angka04);
    }

    public static void basic8() {

        // Konfersi data

        int nilaiInt = 150; // 32Byte
        System.out.println("Nilai Int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai Long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai Byte = " + nilaiByte);

        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);

        // Casting pembagian
        float a = 10;
        int b = 8;

        float c = a / b;
        System.out.printf("\n%f / %d = %f\n", a, b, c);

        int x = 10;
        int y = 8;

        float z = (float) x / y;
        System.out.printf("%d / %d = %f", x, y, z);
    }

    public static void basic9() {

        // Unary = Operasi yang dilakukan pada satu variabel

        // Unary + dan -
        int angka1 = 1;
        System.out.printf("Unary '+', %d menjadi %d\n", angka1, +angka1);
        System.out.printf("Unary '-', %d menjadi %d\n\n", angka1, -angka1);

        // Unary increment dan decrement
        // Unary Increment
        int angka2 = 1;
        angka2++;
        System.out.println("======= Unary increment");
        System.out.println("Angka 1 dengan '++' menjadi = " + angka2 + "\n");

        // Decrement
        int angka3 = 1;
        angka3--;
        System.out.println("======= Unary decrement");
        System.out.println("Angka 1 dengan '--' menjadi = " + angka3 + "\n");

        int a = 2;
        int b = 2;
        a++; // menambah nilai a sebanyak 1
        ++b; // menambah nilai b sebanyak 1
        System.out.println("Nilai a = " + ++a); // '++a' akan menambahkan nilai a sebanyak 1
        System.out.println("Nilai b = " + b++); // 'b++' akan menambahkan nilai b setelah ditampilkan nilai sebelumnya
        System.out.printf("Nilai b = %d\n\n", b++); // 'b++' dengan menggunakan 'printf' dapat menambahkan nilai b

        // Unary boolean dengan tanda ! untuk negasi

        boolean kata = true;
        System.out.println("======= Unary boolean");
        System.out.println("Nilai boolean = " + kata);
        System.out.println("Nilai boolean = " + !kata);
    }

    public static void basic10() {

        // Assignment
        int n = 10;
        System.out.println("Nilai awal dari 'n' adalah " + n + "\n");

        n = 10;
        n += 2;
        System.out.println("Nilai 'n' dengan menggunakan '+=' = " + n + "\n");

        n = 10;
        n -= 2;
        System.out.println("Nilai 'n' dengan menggunakan '-=' = " + n + "\n");

        n = 10;
        n *= 2;
        System.out.println("Nilai 'n' dengan menggunakan '*=' = " + n + "\n");

        n = 10;
        n /= 2;
        System.out.println("Nilai 'n' dengan menggunakan '/=' = " + n + "\n");

        n = 10;
        n %= 3;
        System.out.println("Nilai 'n' dengan menggunakan '%=' = " + n + "\n");
    }

    public static void basic11() {

        // Operator komparasi (menghasilkan nilai dalam bentuk boolean)

        // Operator komparasi (menampilkan nilai dalam bentuk boolean)
        int a, b;
        boolean hasil;

        // Operator equal (persamaan)
        a = 10;
        b = 10;
        hasil = (a == b);
        System.out.println("======= Persamaan");
        System.out.printf("%d == %d --> %s \n", a, b, hasil);

        a = 10;
        b = 20;
        hasil = (a == b);
        System.out.printf("%d == %d --> %s \n\n", a, b, hasil);

        // Operator not equal (pertidaksamaan)
        a = 10;
        b = 20;
        hasil = (a != b);
        System.out.println("======= Pertidaksamaan");
        System.out.printf("%d != %d --> %s \n", a, b, hasil);

        a = 10;
        b = 10;
        hasil = (a != b);
        System.out.printf("%d != %d --> %s \n\n", a, b, hasil);

        // Operator less than (kurang dari)
        a = 10;
        b = 20;
        hasil = (a < b);
        System.out.println("======= Kurang dari");
        System.out.printf("%d < %d --> %s \n", a, b, hasil);

        a = 20;
        b = 10;
        hasil = (a < b);
        System.out.printf("%d < %d --> %s \n\n", a, b, hasil);

        // Operator greater than (lebih dari)
        a = 20;
        b = 10;
        hasil = (a > b);
        System.out.println("======= Lebih dari");
        System.out.printf("%d > %d --> %s \n", a, b, hasil);

        a = 10;
        b = 20;
        hasil = (a > b);
        System.out.printf("%d > %d --> %s \n\n", a, b, hasil);

        // Operator less than equal (lebih kecil dari sama dengan)
        a = 10;
        b = 20;
        hasil = (a <= b);
        System.out.print("======= Lebih kecil dari sama dengan");
        System.out.printf("%d <= %d --> %s \n", a, b, hasil);

        a = 10;
        b = 20;
        hasil = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasil);

        a = 10;
        b = 10;
        hasil = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasil);

        a = 20;
        b = 10;
        hasil = (a <= b);
        System.out.printf("%d <= %d --> %s \n\n", a, b, hasil);

        // Operator greater than equal (lebih besar dari sama dengan)
        a = 20;
        b = 10;
        hasil = (a >= b);
        System.out.println("======= Lebih besar dari sama dengan");
        System.out.printf("%d >= %d --> %s \n", a, b, hasil);

        a = 10;
        b = 10;
        hasil = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasil);

        a = 10;
        b = 20;
        hasil = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasil);
    }

    public static void basic12() {

        // Operator logika ---> Operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi
        boolean a, b, c;

        // AND
        System.out.println("======= AND (&&)");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + "  && " + b + "  = " + c);

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + "  && " + b + " = " + c);

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + "  = " + c);

        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c + "\n");

        // OR
        System.out.println("======= OR (||)");
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + "  || " + b + "  = " + c);

        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + "  || " + b + " = " + c);

        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + "  = " + c);

        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c + "\n");

        // XOR
        System.out.println("======= XOR (^)");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + "  ^ " + b + "  = " + c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + "  ^ " + b + " = " + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "  = " + c);

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c + "\n");

        // NOT / Negasi ---> Flipping (!)
        System.out.println("======= Negasi (!)");
        a = true;
        b = !a;
        System.out.println(a + "  --> (!) = " + b);

        a = false;
        b = !a;
        System.out.println(a + " --> (!) = " + b);
    }

    public static void basic13() {

        // Operator bitwise --> operator untuk melalukan operasi pada nilai bit
        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        // Operator SHIFT LEFT
        System.out.println("======= SHIFT LEFT (<<)");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte) (a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", b_bits, b);

        // Operator SHIFT RIGHT
        System.out.println("======= SHIFT RIGHT (>>)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte) (a >> 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", b_bits, b);

        // Operator BITWISE OR
        System.out.println("======= BITWISE OR (|)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("=== OR ===");
        c = (byte) (a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", c_bits, c);

        // Operator BITWISE AND
        System.out.println("======= BITWISE AND (^)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("=== AND ===");
        c = (byte) (a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", c_bits, c);

        // Operator BITWISE XOR
        System.out.println("======= BITWISE XOR (~)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("=== XOR ===");
        c = (byte) (a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", c_bits, c);

        // Operator NEGASI (NOT)
        System.out.println("======= BITWISE XOR");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n", b_bits, b);
    }

    public static void basic14() {

        // Mengambil inputan
        Scanner user = new Scanner(System.in);
        int panjang, lebar, tinggi, luas, volume;

        // Membuat perhitungan
        System.out.println("======= Menghitung Luas");
        System.out.print("Panjang = ");
        panjang = user.nextInt();
        System.out.print("Lebar = ");
        lebar = user.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas + "\n");

        System.out.println("======= Menghitung Volume");
        System.out.print("Tinggi = ");
        tinggi = user.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);

        user.close();
    }

    public static void basic15() {

        // Operasi Aritmatika
        int hasil;
        hasil = 2 + 3 - 4;
        System.out.println(hasil);
        hasil = 3 * 6 / 9;
        System.out.println(hasil);

        // Menggunakan pengelompokan operasi dengan ( )
        hasil = 60 / (2 * 10);
        System.out.println(hasil);

        Scanner user = new Scanner(System.in);

        // Persamaan kaudrat
        System.out.println("======= Perhitungan Sederhana (a + b * c)");
        int a, b, c, n;

        System.out.print("Nilai a = ");
        a = user.nextInt();
        System.out.print("Nilai b = ");
        b = user.nextInt();
        System.out.print("Nilai c = ");
        c = user.nextInt();

        n = a + b * c;
        System.out.println("Nilai n = " + n);

        user.close();
    }

    /**
     * 
     */
    public static void basic16() {

        // Membuat sebuah objek untuk menangkap input dari user
        Scanner user = new Scanner(System.in);

        // Sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai tebakan anda: ");
        nilaiTebakan = user.nextInt();
        System.out.println("Nilai tebakan anda adalah: " + nilaiTebakan);

        // Operasi langka
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda: " + statusTebakan);

        // Operasi aljabar boolean (and / or)

        System.out.println("Masukkan nilai antara 4 dan 9");
        nilaiTebakan = user.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        /*
         * a | b | c
         * 0 0 0
         * 0 1 0
         * 1 0 0
         * 1 1 1
         */
        System.out.println("Tebakan anda: " + statusTebakan);

        user.close();
    }

    public static void basic17() {

        // If Statement atau Percabangan

        int a = 5;
        System.out.println("Nilai = " + a);

        // Ini adalah cabangnya
        if (a == 10) {

            System.out.println("Ini adalah cabang");

        } else {
            System.out.println("Ini adalah jalur false");
        }

        System.out.println("Selesai");
    }

    public static void basic18() {

        // a operator b
        Scanner user;
        float a, b, hasil;
        char operator;

        user = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = user.nextFloat();
        System.out.print("Operator : ");
        operator = user.next().charAt(0);
        System.out.print("Nilai b = ");
        b = user.nextFloat();

        System.out.println("Hasil input: " + a + " " + operator + " " + b);

        if (operator == '+') {
            // Penjumalahan
            hasil = a + b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '-') {
            // Pengurangan
            hasil = a - b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '*') {
            // Perkalian
            hasil = a * b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '/') {
            // Pembagian
            if (b == 0) {
                System.out.println("Perkalian nol tidak diperbolehkan");
            }
            hasil = a / b;
            System.out.println("Hasil = " + hasil);

        } else {
            System.out.println("Pilihan tidak tersedia");

        }

        user.close();

    }

    public static void basic19() {

        Scanner user;
        float a, b, hasil;
        String operator;

        user = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = user.nextFloat();
        System.out.print("Operator : ");
        operator = user.next();
        System.out.print("Nilai b = ");
        b = user.nextFloat();

        switch (operator) {
            case "+":
                // Penjumlahan
                hasil = a + b;
                System.out.println("Hasil dari " + a + " + " + b + " = " + hasil);
                break;
            case "-":
                // Pengurangan
                hasil = a - b;
                System.out.println("Hasil dari " + a + " - " + b + " = " + hasil);
                break;
            case "*":
                // Penjumlahan
                hasil = a * b;
                System.out.println("Hasil dari " + a + " * " + b + " = " + hasil);
                break;
            case "/":
                // Penjumlahan
                hasil = a / b;
                System.out.println("Hasil dari " + a + " / " + b + " = " + hasil);
                break;
            default:
                System.out.println("Hasil tidak ditemukan");
                break;
        }

        user.close();
    }

    public static void basic20() {

        // While (kondisi)
        int a = 0;
        boolean kondisi = true;

        System.out.println("==== Progress ====");

        while (kondisi) {
            System.out.println("Looping in " + a);
            a++;

            if (a == 2) {
                kondisi = false;

            }
        }
        System.out.println("==== Complete ====");

    }

    public static void basic21() {

        // Do (aksi)
        int a = 0;
        boolean kondisi = true;

        System.out.println("==== Progress ====");

        do {
            a++;
            System.out.println("Looping in " + a);

            if (a == 7) {
                kondisi = false;

            }
        }

        while (kondisi);
        System.out.println("==== Complete ====");
    }

    public static void basic22() {

        System.out.println("=== Starting Program ===");
        System.out.println("First proggram");
        for (int nilai = 0; nilai < 10; nilai++) {
            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("Second program");
        for (int nilai = 0; nilai <= 10; nilai++) {
            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("Third program");
        for (int nilai = 10; nilai >= 0; nilai--) {
            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("Fourth program");
        int nilai = 0;
        for (; nilai < 10;) {

            System.out.println("For loop ke-" + nilai);
            nilai++;
        }

        System.out.println("Complete program");
    }

    public static void basic23() {

        // Program untuk mwnjumlahkan angka dengan rentang
        int awal, akhir, total;

        Scanner user = new Scanner(System.in);
        System.out.print("Masukkan nilai awal   : ");
        awal = user.nextInt();
        System.out.print("Masukkan nilai akhir  : ");
        akhir = user.nextInt();

        total = 0;
        while (awal <= akhir) {

            total = total + awal;
            System.out.println("Ditambah " + awal + " menjadi " + total);
            awal++;
        }

        user.close();
    }

    public static void basic24() {

        // Menghitung deret fibonacci
        int f_n, f_n_1, f_n_2, n;

        Scanner user = new Scanner(System.in);
        System.out.print("Mengambil nilai fibonacci ke -");
        n = user.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++) {

            System.out.println("Nilai ke - " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

            user.close();
        }
    }

    public static void basic25() {

        // Break, continue % return
        int a = 0;

        while (true) {
            a++;

            if (a == 10) {
                break;
                // Ini adalah keyword untuk keluar dari loop
            } else if (a == 5) {
                continue;
                // Ini adalah keyword untuk memaksa memluai dari awal
            } else if (a == 8) {
                return;
                // Ini adalah keyword untuk keluar dari program
            }

            System.out.println("Looping ke - " + a);
        }

        System.out.println("Selesai");
    }

    public static void basic26() {

        // Looping bersarang
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
                if (i + j == 4) {
                    break;
                }
            }
            System.out.print("\n");

        }

        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" *");
                if (i == j) {
                    break;
                } else if (i + j == 8) {
                    break;
                }
            }

            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println();
    }

    public static void basic27() {

        int panjang = 3;
        int lebar = 5;

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void basic28() {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int nilai = input.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("Nilai fibonacci ke - " + nilai + " adalah " + nilai_fibonacci);

        input.close();
    }

    private static int fibonacci(int n, String daun) {

        System.out.println("Daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }

    public static void basic29() {

        System.out.print("Masukkan angka integer = ");
        int hasilInteger = tambah(4, 5);
        printAngka(hasilInteger);

        float hasilFloat = tambah(4.5f, 4);
        printAngka(hasilFloat);

        printAngka(2);
        printAngka(4);
        printAngka(7);
        printAngka(2.7f);
        printAngka(2.7d);
    }

    private static int tambah(int angkaInt1, int angkaInt2) {

        return angkaInt1 + angkaInt2;
    }

    private static float tambah(float angkaFLoat1, float angkaFloat2) {

        return angkaFLoat1 + angkaFloat2;
    }

    private static void printAngka(int angkaInteger) {

        System.out.println("Angka tersebut adalah integer dengan nilai " + angkaInteger);
    }

    private static void printAngka(float angkaInteger) {

        System.out.println("Angka tersebut adalah float dengan nilai " + angkaInteger);
    }

    private static void printAngka(double angkaInteger) {

        System.out.println("Angka tersebut adalah double dengan nilai " + angkaInteger);
    }

    public static void basic30() {

        // Assigment array
        System.out.println("Assigment Array");

        // tipe data[] nama = {komponen - komponen};*
        // Index = 0 1 2 3
        // | | | |
        int[] arrayInteger = { 1, 2, 3, 4 };
        arrayInteger[0] = 11;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        // Deklarasi array
        // Tipe data[] nama = new tipe data[jumlahArray];*
        float[] arrayFloat = new float[4];
        arrayFloat[3] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);

        System.out.println("\n" + Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
    }

    public static void basic31() {

        int[] arrayAngka = { 2, 4, 7, 13 };

        // Looping standard
        for (int i = 0; i < 4; i++) {
            System.out.println("Index ke " + i + " adalah " + arrayAngka[i]);
        }

        System.out.println();

        // Looping dengan properti array
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("Index ke " + i + " adalah " + arrayAngka[i]);
        }

        System.out.println();

        // Looping khususon untuk array <-- array
        for (int angka : arrayAngka) {

            System.out.println("Angka pada looping ini adalah " + angka);
        }
    }
}
