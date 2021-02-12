
package ternary_operator;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
    
        //ternary operator
        
        
        //ex:
        
        int input, x;
        
        Scanner userInput = new Scanner (System.in);
        
        System.out.print("masukkan nilai = ");
        input = userInput.nextInt();
        
        //variable x = ekspresi? statement_true : statement_false
        x = (input == 10) ? (input * input) : (input / 2);
        System.out.println("hasillnya = " + x);
        
        //jika memakai IF
        /*if (input == 10) {
            x = input * input;
        }else{
            x = input / 2;
        }*/
            
    }
    
}
