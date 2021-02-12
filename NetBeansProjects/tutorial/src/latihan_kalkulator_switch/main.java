
package latihan_kalkulator_switch;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

            // a operator b
            Scanner inputUser;
            float a,b,hasil;
            String operator;
            
            inputUser = new Scanner (System.in);
            System.out.print("nliai a = ");
            a = inputUser.nextFloat();
            System.out.print("operator = ");
            operator = inputUser.next();
            System.out.print("nilai b = ");
            b = inputUser.nextFloat();
            
            
            switch(operator){
                case "+":
                        //penjumlahan
                    hasil = a + b;
                    System.out.println("hasil = " + hasil);
                    break;
                case "-":
                        //pengurangan
                    hasil = a - b;
                    System.out.println("hasil = " + hasil);
                    break;
                case "/":
                        //pembagian
                    if (b == 0) {
                        System.out.println("nilai tak hingga");
                    }else{
                    hasil = a / b;
                    System.out.println("hasil = " + hasil);
                    }
                    break;
                case "*":
                        //perkalian
                    hasil = a * b;
                    System.out.println("hasil = " + hasil);
                    break;
                default:
                    System.out.println("operator yang anda cari = " + operator + "  tidak ditemukan");
                    break;
                            
         
            }
    }
    
}
