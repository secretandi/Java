package com.Basic;

public class Basic05 {
  public static void main(String[] args) {
    
    //Unary (Operasi yang dilakukan pada satu variabel)
    int angka01 = 5;
    System.out.printf("Unary '+' = %d menjadi %d\n", angka01, +angka01);
    System.out.printf("Unary '-' = %d menjadi %d\n\n", angka01, -angka01);
    
    angka01 = 5;
    angka01++;
    System.out.println("Nilai dengn '++' menjadi " + angka01);
    
    angka01 = 5;
    angka01--;
    System.out.println("Nilai dengn '--' menjadi " + angka01);
    
    angka01 = 5;
    System.out.println("Nilai dengn '++' menjadi " + ++angka01);
    
    angka01 = 5;
    System.out.println("Nilai dengn '--' menjadi " + --angka01 + "\n");
    
    //Unary boolean dengan ! untuk negasi
    boolean Word = true;
    System.out.println("Nilai boolean = " + Word);
    System.out.println("Nilai boolean = " + !Word);
  }
}