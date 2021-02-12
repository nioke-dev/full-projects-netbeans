
package oop_java;

//public class inheritance {
//
//}

class mobil {
    String merek = "Mitsubisi";
    String warna = "Merah";
    
    public void berjalan() {
        System.out.println("ngengggg");
    }
}

class kendaraan{
    String brand = "honda";
    String lokasi = "probolinggo";
    String merk = "civic";
}
        
class dealer extends kendaraan{

    public static void main (String[] args){
    dealer dlr = new dealer();
        System.out.println("silahkan ambil mobil anda di dealer = " + dlr.lokasi);
    }
    
    
    
    
   
            
            
}

//class Sedan extends mobil {
//    
//    public static void main(String[] args) {
//        Sedan s = new Sedan();
//        System.out.println(s.merek);
//        s.berjalan();
        
        
        
//    }
//}
