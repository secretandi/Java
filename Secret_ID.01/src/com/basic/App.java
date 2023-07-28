package com.basic;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        basic5();
        // Terdapat eror pada basic14

    }

    public static void basic1() {
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

    public static void basic3() {
        // Hitungan
        int angka01 = 10;
        int angka02 = 20;
        System.out.print("Nilai angka01 = " + angka01 + "\nNilai angka02 = " + angka02 + "\n\n");

        // Penjumlahan
        int angka03 = angka01 + angka02;
        System.out.println("Nilai angka01 + angka02 = " + angka03);
        System.out.printf("Nilai angka01 + angka02 = %d\n\n", angka03);

        // Pengurangan
        angka03 = angka02 - angka01;
        System.out.println("Nilai angka02 - angka01 = " + angka03);
        System.out.printf("Nilai angka02 - angka01 = %d\n\n", angka03);

        // Perkalian
        angka03 = angka01 * angka02;
        System.out.println("Nilai angka01 - angka02 = " + angka03);
        System.out.printf("Nilai angka01 - angka02 = %d\n\n", angka03);

        // Pembagian
        angka03 = angka02 / angka01;
        System.out.println("Nilai angka02 : angka01 = " + angka03);
        System.out.printf("Nilai angka02 : angka01 = %d\n\n", angka03);

        // Modulus (Hasil sisa bagi)
        angka03 = angka02 % angka01;
        System.out.println("Nilai angka02 % angka01 = " + angka03);
    }

    public static void basic5() {
        // Unary (Operasi yang dilakukan pada satu variabel)
        int angka = 5;
        System.out.printf("Unary '+' = %d menjadi %d\n", angka, +angka);
        System.out.printf("Unary '-' = %d menjadi %d\n\n", angka, -angka);

        angka = 5;
        angka++;
        System.out.println("Nilai dengn '++' menjadi " + angka);

        angka = 5;
        angka--;
        System.out.println("Nilai dengn '--' menjadi " + angka);

        angka = 5;
        System.out.println("Nilai dengn '++' menjadi " + ++angka);

        angka = 5;
        System.out.println("Nilai dengn '--' menjadi " + --angka + "\n");

        // Unary boolean dengan ! untuk negasi
        boolean Word = true;
        System.out.println("Nilai boolean = " + Word);
        System.out.println("Nilai boolean = " + !Word);
    }

    public static void basic6() {
        // Assignment
        int angka = 5;
        angka = angka + angka;
        angka = angka + 5;
        angka = 5 + angka;
        System.out.println("Nilai 'angka'     = " + angka);

        angka = 25;
        angka += 10;
        System.out.println("Nilai 'angka' +=' = " + angka);

        angka = 25;
        angka -= 10;
        System.out.println("Nilai 'angka' -=' = " + angka);

        angka = 25;
        angka *= 10;
        System.out.println("Nilai 'angka' *=' = " + angka);

        angka = 25;
        angka /= 10;
        System.out.println("Nilai 'angka' /=' = " + angka);

        angka = 25;
        angka %= 10;
        System.out.println("Nilai 'angka' %=' = " + angka);
    }

    public static void basic7() {
        // Operator komparasi (menampilkan nilai dalam bentuk boolean)
        int a, b;
        boolean c;

        // Operator equal (persamaan)
        a = 10;
        b = 10;
        c = (a == b);
        System.out.println("===== Persamaan =====");
        System.out.printf("%d == %d --> %s \n", a, b, c);

        a = 10;
        b = 20;
        c = (a == b);
        System.out.printf("%d == %d --> %s \n\n", a, b, c);

        // Operator not equal (pertidaksamaan)
        a = 10;
        b = 20;
        c = (a != b);
        System.out.println("===== Pertidaksamaan =====");
        System.out.printf("%d != %d --> %s \n", a, b, c);

        a = 10;
        b = 10;
        c = (a != b);
        System.out.printf("%d != %d --> %s \n\n", a, b, c);

        // Operator greater than (lebih dari)
        a = 20;
        b = 10;
        c = (a > b);
        System.out.println("===== Lebih dari =====");
        System.out.printf("%d > %d --> %s \n", a, b, c);

        a = 10;
        b = 20;
        c = (a > b);
        System.out.printf("%d > %d --> %s \n\n", a, b, c);

        // Operator less than (kurang dari)
        a = 10;
        b = 20;
        c = (a < b);
        System.out.println("===== Kurang dari =====");
        System.out.printf("%d < %d --> %s \n", a, b, c);

        a = 20;
        b = 10;
        c = (a < b);
        System.out.printf("%d < %d --> %s \n\n", a, b, c);

        // Operator greater than equal (lebih besar dari sama dengan)
        a = 20;
        b = 10;
        c = (a >= b);
        System.out.println("===== Lebih besar dari sama dengan =====");
        System.out.printf("%d >= %d --> %s \n", a, b, c);

        a = 10;
        b = 10;
        c = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, c);

        a = 10;
        b = 20;
        c = (a >= b);
        System.out.printf("%d >= %d --> %s \n\n", a, b, c);

        // Operator less than equal (lebih kecil dari sama dengan)
        a = 10;
        b = 20;
        c = (a <= b);
        System.out.print("===== Lebih kecil dari sama dengan =====");
        System.out.printf("%d <= %d --> %s \n", a, b, c);

        a = 10;
        b = 20;
        c = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, c);

        a = 10;
        b = 10;
        c = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, c);

        a = 20;
        b = 10;
        c = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, c);
    }

    public static void basic8() {
        // Operator logika ---> Operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi
        boolean a, b, c;

        // AND
        System.out.println("===== AND / (&&) =====");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c + "\n");

        // OR
        System.out.println("===== OR / (||) =====");
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c + "\n");

        // XOR
        System.out.println("===== XOR / (^) =====");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c + "\n");

        // NOT / Negasi ---> Flipping (!)
        System.out.println("===== Negasi (!) =====");
        a = true;
        b = !a;
        System.out.println(a + " --> (!) = " + b);

        a = false;
        b = !a;
        System.out.println(a + " --> (!) = " + b);
    }

    public static void basic9() {
        // Operator bitwise --> operator untuk melalukan operasi pada nilai bit
        System.out.println("===== Operator bitwise =====");
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
        System.out.println("===== Shift Right << 3 =====");
        num1 = (byte) (a << 3);
        num1_bits = String.format("%8s", Integer.toBinaryString(num1)).replace(' ', '0');
        System.out.printf("%s = %d << %s = %d \n", a_bits, a, num1_bits, num1);

        num2 = (byte) (b << 3);
        num2_bits = String.format("%8s", Integer.toBinaryString(num2)).replace(' ', '0');
        System.out.printf("%s = %d << %s = %s \n", b_bits, b, num2_bits, num2);

        num3 = (byte) (c << 3);
        num3_bits = String.format("%8s", Integer.toBinaryString(num3)).replace(' ', '0');
        System.out.printf("%s = %d << %s = %d \n\n", c_bits, c, num3_bits, num3);

        // Operator shift left
        System.out.println("===== Shift Left >> 2 =====");
        num4 = (byte) (num1 >> 2);
        num4_bits = String.format("%8s", Integer.toBinaryString(num4)).replace(' ', '0');
        System.out.printf("%s = %d >> %s = %d \n", num1_bits, num1, num4_bits, num4);

        num4 = (byte) (num2 >> 2);
        num4_bits = String.format("%8s", Integer.toBinaryString(num4)).replace(' ', '0');
        System.out.printf("%s = %d >> %s = %s \n", num2_bits, num2, num4_bits, num4);

        num4 = (byte) (num3 >> 2);
        num4_bits = String.format("%8s", Integer.toBinaryString(num4)).replace(' ', '0');
        System.out.printf("%s = %d >> %s = %d \n\n", num3_bits, num3, num4_bits, num4);

        // Variabel baru
        a = 2;
        b = 4;
        c = 7;

        // Operator bitwise OR
        System.out.println("===== Bitwise OR (|) =====");
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
        System.out.println("===== Bitwise AND (&) =====");
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
        System.out.println("===== Bitwise XOR (^) =====");
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
        System.out.println("===== Bitwise NOT (~) =====");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        d = (byte) (~a);
        d_bits = String.format("%8s", Integer.toBinaryString(d).substring(24));
        System.out.printf("%s = %d \n", d_bits, d);
    }

    public static void basic10() {

        Scanner user = new Scanner(System.in);

        System.out.println("## Persegi ##");
        int sisi, luas, keliling;
        // Menghitung luas dan keliling persegi
        // Luas = Sisi * sisi
        // Keliling = 4 * Sisi

        System.out.println("======= Luas (Sisi * Sisi)");
        System.out.print("Sisi = ");
        sisi = user.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas = " + luas + "\n");

        System.out.println("======= Keliling (4 * Sisi)");
        keliling = 4 * sisi;
        System.out.println("Keliling = " + keliling + "\n\n");


        System.out.println("## Persegi Panjang ##");
        int panjang, lebar;
        // Menghitung luas dan keliling persegi panjang
        // Luas = Panjang * Lebar
        // Keliling = 2 * (PAnjang * Lebar)

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


        System.out.println("## Segitiga ##");
        int alas, tinggi, panjang_AB, panjang_BC, panjang_AC;
        double lusa_segitiga;
        // Menghitung luas dan keliling segitiga
        // Luas = 0.5 * Alas * Tinggi
        // Keliling = Panjang AB + Panjang BC + Panjang AC

        System.out.println("======= Luas (1/2 * Alas * Tinggi)");
        System.out.print("Alas = ");
        alas = user.nextInt();
        System.out.print("Tinggi = ");
        tinggi = user.nextInt();
        lusa_segitiga = 1/2 * alas * tinggi;
        System.out.println("Luas = " + lusa_segitiga + "\n");

        System.out.println("======= Keliling (Panjang AB + BC + AC)");
        System.out.print("Panjang AB = ");
        panjang_AB = user.nextInt();
        System.out.print("Panjang BC = ");
        panjang_BC = user.nextInt();
        System.out.print("Panjang AC = ");
        panjang_AC = user.nextInt();
        keliling = panjang_AB + panjang_BC + panjang_AC;
        System.out.println("Keliling = " + keliling + "\n\n");

        
        System.out.println("## Lingkaran ##");
        int r, diameter;
        double luas_lingkaran, keliling_lingkaran;
        double phi = 3.14;
        // Menghitung luas dan keliling lingkaran
        // Luas = PHI * Jari-jari^2
        // Keliling = PHI * Diameter

        System.out.println("======= Luas (PHI * Jari-jari^2)");
        System.out.print("Jari-jari = ");
        r = user.nextInt();
        luas_lingkaran = phi * (r * r);
        System.out.println("Luas = " + luas_lingkaran + "\n");

        System.out.println("======= Keliling (phi * Diameter)");
        diameter = 2 * r;
        keliling_lingkaran = phi * diameter;
        System.out.println("Keliling = " + keliling_lingkaran + "\n\n");
        
        user.close();
    }

    public static void basic13() {

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

    public static void basic14() {

       int ax = 5;
       int bx = 10;

       if (ax == 5) {

            if (bx == 10) {
                System.out.println("Angka " + ax + " adalah perkalian 5 dan angka " + bx + " juga merupakan perkalian 5");

            } else {
                System.out.println("Angka " + ax + " adalah perkalian 5 sedangkan angka " + bx + " tidak termasuk perkalian 5");
                

            }
       } else {
        System.out.print("Angka " + ax + " bukan merupakan perkalian 5, program diakhiri");

       }
    }

    public static void basic15() {

        String input;
        Scanner user = new Scanner(System.in);

        System.out.print("Masukkan data: ");
        input = user.next();

        switch(input) {
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
}