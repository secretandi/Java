package com.Secret_ID;

import java.util.Scanner;
public class System02 {
  public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
  
  System.out.print("Masukkan tinggi segitiga: ");
  int tinggi = input.nextInt();
  input.nextLine();
  
  System.out.print("Masukkan jumlah spasi: ");
  String spasi = input.nextLine();
  
  for (int i = 1; i <= tinggi; i++) {
    for (int j = 1; j <= tinggi - i; j++) {
      System.out.print(spasi);
    }
    for (int k = 1; k <= 2 * i - 1; k++) {
      System.out.print(i);
    }
    System.out.println();
    }
  }
}