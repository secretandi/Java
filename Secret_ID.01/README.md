## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

# Table of Contents

# [Basic 01](#basic-01)

# [Basic 02]()

# [Basic 03](#basic-03)

# [Basic 04](#basic-04)

# [Basic 05](#basic-05)

# [Basic 06](#basic-06)

# [Basic 07](#basic-07)

# Content

# Basic 01

```java
public static void basic1() {
    System.out.print("Andra");
}
```

# Basic 03

```java
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
```

# Basic 05

```java
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
```

# Basic 06

```java
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
```

# Basic 07

```java
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
```
