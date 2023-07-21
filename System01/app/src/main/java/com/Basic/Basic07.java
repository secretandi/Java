package com.Basic;

public class Basic07 {
  public static void main(String[] args) {
    
    //Operator komparasi (menampilkan nilai dalam bentuk boolean)
    int a,b;
    boolean c;
    
    //Operator equal (persamaan)
    a = 10;
    b = 10;
    c = (a == b);
    System.out.println("===== Persamaan =====");
    System.out.printf("%d == %d --> %s \n", a, b, c);
    
    a = 10;
    b = 20;
    c = (a == b);
    System.out.printf("%d == %d --> %s \n\n", a, b, c);
    
    //Operator not equal (pertidaksamaan)
    a = 10;
    b = 20;
    c = (a != b);
    System.out.println("===== Pertidaksamaan =====");
    System.out.printf("%d != %d --> %s \n", a, b, c);
    
    a = 10;
    b = 10;
    c = (a != b);
    System.out.printf("%d != %d --> %s \n\n", a, b, c);
    
    //Operator greater than (lebih dari)
    a = 20;
    b = 10;
    c = (a > b);
    System.out.println("===== Lebih dari =====");
    System.out.printf("%d > %d --> %s \n", a, b, c);
    
    a = 10;
    b = 20;
    c = (a > b);
    System.out.printf("%d > %d --> %s \n\n", a, b, c);
    
    //Operator less than (kurang dari)
    a = 10;
    b = 20;
    c = (a < b);
    System.out.println("===== Kurang dari =====");
    System.out.printf("%d < %d --> %s \n", a, b, c);
    
    a = 20;
    b = 10;
    c = (a < b);
    System.out.printf("%d < %d --> %s \n\n", a, b, c);
    
    //Operator greater than equal (lebih besar dari sama dengan)
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
    
    //Operator less than equal (lebih kecil dari sama dengan)
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
}
