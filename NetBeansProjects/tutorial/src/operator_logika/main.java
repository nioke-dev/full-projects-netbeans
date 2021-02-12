package operator_logika;

public class main {
    public static void main(String[] args){
    
    //operator logika---> operasi yang bisa kita lakukan kepasa tipe data booolean 
    //AND, OR, XOR, negasi
    
    boolean a,b,c;
    
    //OR / ATAU (||)
    
        System.out.println("==== OR(||) ====");
        a = false;
        b = false;
        
        c = (a || b);
        System.out.println(a + " || " + b + " = " +c);
        
        a = false;
        b = true;
        
        c = (a || b);
        System.out.println(a + " || " + b + " = " +c);
        
        a = true;
        b = false;
        
        c = (a || b);
        System.out.println(a + " || " + b + " = " +c);
        
        a = true;
        b = true;
        
        c = (a || b);
        System.out.println(a + " || " + b + " = " +c);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //AND(&&)
        
        System.out.println("==== AND(&&) ====");
        
        a = false;
        b = false;
        
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);
        
        a = false;
        b = true;
        
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);
        
        a = true;
        b = false;
        
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);
        
        a = true;
        b = true;
        
        c = (a && b);
        System.out.println(a + " && " + b + " = " +c);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //XOR/exclusive or (^)
        
        System.out.println("==== XOR(^) ====");
        
        a = false;
        b = false;
        
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " +c);
        
        a = false;
        b = true;
        
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " +c);
        
        a = true;
        b = false;
        
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " +c);
        
        a = true;
        b = true;
        
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " +c);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //NOT /  negasi-->flipping(!)
        
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
        
        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
   
   
         
    
    
    }
    
}
