/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latianedo;

/**
 *
 * @author The Coders
 */
public class latihan_tipe_data {
    public static void main(String[] args) {        
        // phi * r * r
        double phi, luas;
        int r;
        phi = 3.14;
        r = 5;
        luas = phi * r * r;
        System.out.println("luas lingkaran = " + luas);
        
        double phi2 = 3.14;
        float sembarang = 3.14f;
        System.out.println(phi2);
        System.out.println(sembarang);
       
        
        

















        
        
        
        
        double d = -10.5d;
        System.out.println("======DOUBLE======");
        System.out.println("nilai double d = " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        System.out.println("Besar double = " + Double.SIZE + " bit");

        // float (koma, bilangan real)
        float f = -10.5f;
        System.out.println("======FLOAT======");
        System.out.println("nilai float f = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float = " + Float.SIZE + " bit");
        
    }
}
