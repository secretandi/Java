package com.Basic;

public class Basic06 {
  public static void main(String[] args) {
    
    //Assignment
    int angka01 = 5;
    angka01 = angka01 + angka01;
    angka01 = angka01 + 5;
    angka01 = 5 + angka01;
    System.out.println("Nilai 'angka01'     = " + angka01);
    
    angka01 = 25;
    angka01 += 10;
    System.out.println("Nilai 'angka01' +=' = " + angka01);
    
    angka01 = 25;
    angka01 -= 10;
    System.out.println("Nilai 'angka01' -=' = " + angka01);
    
    angka01 = 25;
    angka01 *= 10;
    System.out.println("Nilai 'angka01' *=' = " + angka01);
    
    angka01 = 25;
    angka01 /= 10;
    System.out.println("Nilai 'angka01' /=' = " + angka01);
    
    angka01 = 25;
    angka01 %= 10;
    System.out.println("Nilai 'angka01' %=' = " + angka01);
  }
}
