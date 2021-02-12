package aaplication;

//class bodo{

import java.util.Scanner;

//    String nama;
//    int kelas;
//}
//construktor (method yg yg pertama di panggil)
//class amad{
//    String a ;
//    String b ; 
//    String c ;
//   amad(String input_a, String input_b, String input_c){
//       a = input_a;
//       b = input_b;
//       c = input_c;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println("==================");
     //  System.out.println("ini construktor");
//} 
     //construktor adlah sebuah method yg diakan dipanggil pertama
     //saat objek dibuat
//}
class jual{
    String nama;
    int berapa;
    int total;

    public jual() {
        Scanner sy = new Scanner(System.in);
            System.out.println("beli apa ?");
            System.out.print("Nama barang\t= ");
            nama = sy.next();
            System.out.print("harga\t= 2500 x ");
            berapa = sy.nextInt();
            total = 2500*berapa;
            System.out.println("total semuanya = Rp "+total);
            System.out.println("==============================");
   
            System.out.println("beli apa ?");
            System.out.print("Nama barang\t= ");
            nama = sy.next();
            System.out.print("harga\t= 6000 x ");
            berapa = sy.nextInt();
            total = 6000*berapa;
            System.out.println("total semuanya = Rp "+total);
            System.out.println("==============================");
    
    }

    
}
public class Main{
    
      public static void main(String[] args) {
    jual sc = new jual();
    jual sc2 = new jual();


     






//        amad sy = new amad("samsul","husnul","jurusan RPL");
//        amad sy1 = new amad("hadi","khotim","jurusan RPL");


          
//        new amad();
          /*bodo sc = new bodo();
        sc.nama = "samsul";
        sc.kelas = 10;
          System.out.println(sc.nama);
          System.out.println(sc.kelas);*/
}
          
          
          
          
          
          
 
      }      
                 