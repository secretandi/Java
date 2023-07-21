package com.Basic;

public class Basic09 {
  public static void main(String[] args) {
    
    //Operator bitwise --> operator untuk melalukan operasi pada nilai bit
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
    
    
    //Operator shift right
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
    
    
    //Operator shift left
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
    
   
    //Variabel baru
    a = 2;
    b = 4;
    c = 7;
    
    //Operator bitwise OR
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
    
    //Operator bitwise AND
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
    
    //Operator bitwise XOR
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
    
    //Operator negasi / NOT
    System.out.println("===== Bitwise NOT (~) =====");
    a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
    System.out.printf("%s = %d \n", a_bits, a);
 
    d = (byte) (~a);
    d_bits = String.format("%8s", Integer.toBinaryString(d).substring(24));
    System.out.printf("%s = %d \n", d_bits, d);
  }
}