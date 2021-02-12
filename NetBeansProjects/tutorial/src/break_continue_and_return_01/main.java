
package break_continue_and_return_01;


public class main {

    public static void main(String[] args) {
     //break,continue, and return
     int a = 0;
     
        while (true) {            
            if (a == 10) {
                break;
                
            }
            
            System.out.println("ini looping ke-" + a);
            a++;
            
        }
        System.out.println("akhir dari looping");   
    }
    
}
