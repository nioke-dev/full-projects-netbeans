
package latihan.operator_aritmatika;


public class main {
    public static void main(String[] args){
    
        //operasi aritmatika
        int variable1 = 10;
        int variable2 = 5;
        
        int hasil;
        
        //1.penjumlahan
        
        hasil = variable1 + variable2;
        System.out.println(variable1 + "+" + variable2 + "=" + hasil);
        //pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);
        //perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);
        //pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);
        //modulus
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
    }
    
    
}
