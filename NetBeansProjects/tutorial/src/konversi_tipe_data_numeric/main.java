package konversi_tipe_data_numeric;

public class main {
    public static void main(String[] args){

       //program untuk konversi data 
       
       int nilaiint = 255; //32bit
        System.out.println("nilai int = " + nilaiint);
        
        //memperluas rentang ke tipe data yang lebih besar
        long nilailong = nilaiint;
        System.out.println("nilai long = " + nilaiint);
        
        //memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiint;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);
        
}    
}
