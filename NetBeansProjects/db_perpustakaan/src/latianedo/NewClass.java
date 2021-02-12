/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latianedo;

import java.util.Scanner;

/**
 *
 * @author The Coders
 */
public class NewClass {
    public static void main(String[] args) {
        double mtk,ipa,bindo,bing,rata;
        String status;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nilai mtk : ");
        mtk = s.nextDouble();
        System.out.print("Masukan nilai ipa : ");
        ipa = s.nextDouble();
        System.out.print("Masukan nilai indonesia : ");
        bindo = s.nextDouble();
        System.out.print("Masukan nilai inggris : ");
        bing = s.nextDouble();
        
        rata = (mtk + ipa + bindo + bing) / 4;
        if (rata >= 75) {
            status = "lulus";
            System.out.println(status);
        } else {
            status = "tidak lulus";
            System.out.println(status);
        }
        
    }
           
    
}
