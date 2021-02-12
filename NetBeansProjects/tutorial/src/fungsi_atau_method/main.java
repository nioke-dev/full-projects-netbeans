
package fungsi_atau_method;
public class main {

    public static void main(String[] args) {
           //y = (x + 2) * x
           int x,y;
           x = 10;
           y = hitung(x);
           
           System.out.println("x = " + x + ", y = " + y);
           
           System.out.println("================");
           
           x = 20;
           y = hitung(x);
           
           System.out.println("x = " + x + ", y = " + y);
           
           System.out.println("================");
           
           x = 30;
           y = hitung(x);
           
           System.out.println("x = " + x + ", y = " + y);
           
           System.out.println("================");
           
    }
    private static int hitung (int input){
        int hasil;
        
        //hasil  = (input + 2) * input;
        hasil = input * input;
        
        
        return hasil;
    }
}
