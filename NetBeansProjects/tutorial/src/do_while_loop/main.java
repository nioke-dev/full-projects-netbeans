
package do_while_loop;

public class main {

    public static void main(String[] args) {
//        do{
//            aksi
//        }while(kondisi);  
        System.out.println("ini adalah awal program");
    int a = 0;
    boolean kondisi = true;
    
    do{
        a++;
        System.out.println("do while ke-" + a);
        
        if (a == 10) {
            kondisi = false;
        }
    }while(kondisi);
    
        System.out.println("ini adalah akhir prgram");
            
    }
    
}
