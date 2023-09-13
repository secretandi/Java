package com.basic;

public class Hardcore {

    // method hitung luas => luas = panjang * lebar
    public static int luasPersegiPanjang(int panjang, int lebar) {

        int result;
        result = panjang * lebar;
        return result;
    }

    // method hitung luas persegi => luas = sisi * sisi
    public static int luasPersegi(int sisi) {

        int result;
        result = sisi * sisi;
        return result;
    }

    // method hitung luas segitiga
    public static double luasSegitiga(int alas, int tinggi) {

        double result;
        result = 0.5 * alas * tinggi;
        return result;
    }

    // method hitung luas lingkaran
    public static double luasLingkaran(int jari_jari) {

        double phi = 3.14;
        double result;
        result = phi * (jari_jari * jari_jari);
        return result;
    }

    // method hitung luas kubus
    public static int luasKubus(int sisi) {

        int result;
        result = 6 * (sisi * sisi);
        return result;
    }

    // method hitung luas balok
    public static int luasBalok(int panjang, int lebar, int tinggi) {

        int pl = panjang * lebar;
        int pt = panjang * tinggi;
        int lt = lebar * tinggi;
        int result;
        result = 2 * (pl + pt + lt);
        return result;
    }
}