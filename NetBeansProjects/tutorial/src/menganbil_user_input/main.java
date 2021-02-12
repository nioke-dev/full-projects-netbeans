package menganbil_user_input;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
    
        Scanner userInput = new Scanner(System.in);
        
        int input = userInput.nextInt();
        System.out.println("input = " + input);
        //membuat perhitungan menghtung luas persegi panjang
        //luas = panjang * lebar
        int panjang = 10;
        int lebar = 4;
        
        int luas = panjang * lebar;
        System.out.println(luas);


}
    
}
