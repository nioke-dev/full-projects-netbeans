
package break_continue_and_return;


public class main {

    public static void main(String[] args) {
        //break
        /*int a = 0;
        
        
        while (true) {
            
            if (a ==10) {
                break;//ini adalah keyword untuk memaksa keluar dari loop
            }
{
                
            }
            a++;
            System.out.println("hasil looping ke- " + a);
            
            
        }
        System.out.println("ini adalah akhir looping");*/
        


        //continue
        /*int a = 0;
        
        
        while (true) {
             a++;
             
             
            if (a ==10) {
                break;//ini adalah keyword untuk memaksa keluar dari loop
            }else if (a == 5) {
                continue;//ini adalah keyword untuk memaksa memulai aksi dari awal
            }

           
            System.out.println("hasil looping ke- " + a);
            
            
        }
        System.out.println("ini adalah akhir looping");*/
        
        
        //return
        int a = 0;
        
        
        while (true) {
             
             
            a++; 
            if (a ==10) {
                break;
                //ini adalah keyword untuk memaksa keluar dari loop
            }else if (a == 5) {
                continue;
                //ini adalah keyword untuk memaksa memulai aksi dari awal
            }else if (a == 7) {
                return;
                //finish
            }

           
            System.out.println("hasil looping ke- " + a);
            
            
        }
        System.out.println("ini adalah akhir looping");
        
    }
    
}
