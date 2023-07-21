package com.Basic;

public class Basic08 {
  public static void main(String[] args) {
  
    //Operator logika ---> Operasi yang bisa kita lakukan kepada tipe data boolean
    //AND, OR, XOR, negasi
    boolean a, b, c;
    
    //AND
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
    
    //OR
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
    
    //XOR
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
    
    //NOT / Negasi ---> Flipping (!)
    System.out.println("===== Negasi (!) =====");
    a = true;
    b = !a;
    System.out.println(a + " --> (!) = " + b);
    
    a = false;
    b = !a;
    System.out.println(a + " --> (!) = " + b);  
  }
}
