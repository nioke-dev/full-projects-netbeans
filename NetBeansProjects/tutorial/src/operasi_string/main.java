
package operasi_string;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        String kalimat = "saya suka makan pisang";
        
        //mengambil komponen dari string
        System.out.println(kalimat.charAt(5));
        
        //Substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);
        
        //concatenation(concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);
        
        //concat dengan cara menimpa
        //note* = string pool membuat memori habis
        
        kata = kata + " cireng";
        System.out.println(kata);
        
        //concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;//casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);
        
        //lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());//upppercase
        System.out.println(kalimat.toLowerCase());//lowercase
        
        //replace
        String kalimat4 = kalimat.replace("pisang", "keddeng");
        System.out.println(kalimat);
        System.out.println(kalimat4);
        
        //compare
        String motor1 = "royal enfield himalayan";
        String motor2 = "kawasaki w175";
        System.out.println(motor1.compareTo(motor2));//klmnopqr
        System.out.println(motor2.compareTo(motor1));
        
        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));
        
        //equality(persamaan)
        String kataInput = "test";//ini ada di string pool
//        String kataInput  = new String("test");//ini bukan string literal, dan tidak berada di string pool
        String kataTest = "test";//ini juga berada di string pool
        
        System.out.println("\npersamaan pada lokasi string pool");
        if (kataInput == kataTest) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
        
        Scanner userInput = new Scanner (System.in);
        System.out.print("\nmengambil input string dari user = ");
        kataInput = userInput.next();//tidak di string pool
        System.out.println("ini adalah input user = " + kataInput);
        
//        if (kataInput == kataTest) {
//            System.out.println("sama");
//        } else {
//            System.out.println("tidak sama");
//        }

        if (kataInput.equals(kataTest)) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
        
        
        
                
        
        
        
        
        
        
        
        
    }
    
}
