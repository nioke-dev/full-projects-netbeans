package pengenalan_string;
import java.util.Arrays;
public class main {
    
    public static void main(String[] args) {
       //membuat string
       
       String kataString = "hallo - hallo bandung";
               
       char[] kataChar = {'h', 'a', 'l', 'l', 'o'};
       
       //menampilkan string
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        
        //mengakses komponen dari string
        
        System.out.println("komponen pertama dari char[] = " + kataChar[3]);
        System.out.println("komponen pertama dari string = " + kataString.charAt(3));
        
        //merubah komponen dari string
        //itu tidak bisa... kenapa?, karena string di java itu immutable
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));
        
        //kataString = "c"; <--- tidak bisa
        //kataString.charArt(0) = "c"; <--- tidak bisa
        
        //kita bisa merubah komponen secara tidak langsung
       kataString = "c" + kataString.subSequence(1, 5);
        
        System.out.println(kataString);
        
        printAddress("kataString", kataString);
        
        //memory dari String (String pool)
        
        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";
        
        printAddress("str_1",str_1);
        printAddress("str_2",str_2);
        printAddress("str_3",str_3);
        
        str_3  = str_3.substring(0,4);
        printAddress(str_3, str_3);
        
        String str_4 = "callo";        
        printAddress(str_4, str_4);
        
        kataString = "callo";
        printAddress("kataString", kataString);
        
        //1. string di java itu immutable
        //2. string yang berada di string pool itu akan reuseable,memorynya lebih efisien
        //3. membuat string dengan method baru, maka dia akan di taro di memoory lain bukan di string pool
        
        //liat lebih dalam
        String a = new String("hallo");
        printAddress(a, a);
        
    }
    private static void printAddress (String nama, String data){
    int adress = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t||adress = " + Integer.toHexString(adress));
    }
}
