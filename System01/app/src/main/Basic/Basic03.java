package main.Basic;

public class Basic03 {
  public static void main(String[] args) {

    //Hitungan
    int angka01 = 10;
    int angka02 = 20;
    System.out.print("Nilai angka01 = " + angka01 + "\nNilai angka02 = " + angka02 + "\n\n");

    //Penjumlahan
    int angka03 = angka01 + angka02;
    System.out.println("Nilai angka01 + angka02 = " + angka03);
    System.out.printf("Nilai angka01 + angka02 = %d\n\n", angka03);
    
    //Pengurangan
    angka03 = angka02 - angka01;
    System.out.println("Nilai angka02 - angka01 = " + angka03);
    System.out.printf("Nilai angka02 - angka01 = %d\n\n", angka03);
    
    //Perkalian
    angka03 = angka01 * angka02;
    System.out.println("Nilai angka01 - angka02 = " + angka03);
    System.out.printf("Nilai angka01 - angka02 = %d\n\n", angka03);
    
    //Pembagian
    angka03 = angka02 / angka01;
    System.out.println("Nilai angka02 : angka01 = " + angka03);
    System.out.printf("Nilai angka02 : angka01 = %d\n\n", angka03);
    
    //Modulus (Hasil sisa bagi)
    angka03 = angka02 % angka01;
    System.out.println("Nilai angka02 % angka01 = " + angka03);
  }
}
