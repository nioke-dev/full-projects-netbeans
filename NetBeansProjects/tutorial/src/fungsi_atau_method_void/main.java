package fungsi_atau_method_void;

public class main {

 
    public static void main(String[] args) {
        //void itu artinya hampa
        System.out.println(simple());
        
        fungsivoid("apapun");
        selamatpagi("bapak");
        selamatpagi("emak");
        
 
      
 
    }
    private static void selamatpagi(String nama){
        System.out.println("selamat pagi " + nama);
    }
    
    //fungsi atau method tanpa pengembalian
    private static void fungsivoid(String input){
        System.out.println(input);
    }
    
    //fungsi atau method dengan pengembalian
    //sehingga menggunakan return untuk
    //mengembalikan nilainya (10.0f)
    private static float simple(){
        return 10.0f;
    }
}
