package com.basic;

import java.util.Scanner;

public class Experience {

    public static void experience_1() {

        // int awal, akhir, total;

        // Scanner user = new Scanner(System.in);
        // System.out.print("Masukkan nilai awal   : ");
        // awal = user.nextInt();
        // System.out.print("Masukkan nilai akhir  : ");
        // akhir = user.nextInt();

        // for (total = awal + akhir; awal <= akhir; awal++) {

        //     System.out.println("Ditambah " + awal + " menjadi " + total);
        // }

        // user.close();
    }

    public static void experience_2() {
        
        int awal, akhir, total;
        boolean  test = true;
        
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

    public static void experience_3() {
        
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
                if (i == j ) {
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
                if (i == j ) {
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
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j < a) {
                    System.out.print("  ");
                    a--;
                } else if (j > b) {
                    System.out.print("  ");
                    b++;
                    j++;
                } else if (i >= 3) {
                    if(j < c) {
                        System.out.print("  ");
                        j++;
                        c++;
                    } else {
                        System.out.print("* ");
                    }
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void experience_4() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai x = ");
        int x = input.nextInt();
        int y = angka(x);
        System.out.println("X = " + x + ", Y = " + y + "\n");

        input.close();
    }

    private static int angka (int input) {

        int hasil;

        hasil = (input + 2) * input;

        return hasil;
    }

}
