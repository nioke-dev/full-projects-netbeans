package looping_bersarang_kotak_and_segitiga;

public class main {


    
    public static void main(String[] args) {
      
        for (int x = 0;  x < 10; x++) {
            
            for (int y = 0; y < 10 ; y++) {
            if (x==y){
                break;
            }
                System.out.print("* ");
            }
                System.out.print("\n");
            
        }

    }
    
}
