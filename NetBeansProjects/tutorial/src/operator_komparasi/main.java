
package operator_komparasi;


public class main {
    public static void main(String[] args){
    
        //operator komparasi....ini akan menghasilkan nilai dalam bentuk boolean
        //contoh 4
         int a,b;
         boolean hasilkomparasi;
         //OPERATOR EQUAL ATAU PERSAMAAN
        System.out.println("=====PERESAMAAN====="); 
         a = 10;
         b = 10;
         
         hasilkomparasi = (a == b);
         System.out.printf("%d == %d --> %s \n",a,b, hasilkomparasi);
        
         a = 12;
         b = 10;
         
         hasilkomparasi = (a == b);
         System.out.printf("%d == %d --> %s \n",a,b, hasilkomparasi);
        
         //OPERATOR NOT EQUAL ATAU PERTIDAKSAMAAN
        System.out.println("=====PERTIDAKSAMAAN====="); 
         a = 10;
         b = 10;
         
         hasilkomparasi = (a != b);
         System.out.printf("%d != %d --> %s \n",a,b, hasilkomparasi);
        
         a = 12;
         b = 10;
         
         hasilkomparasi = (a != b);
         System.out.printf("%d != %d --> %s \n",a,b, hasilkomparasi);
        
         //operator less than atau kurang dari 
         System.out.println("------------kurang dari------------");
         a = 10;
         b = 10;
         
         hasilkomparasi = (a < b);
         System.out.printf("%d < %d --> %s \n",a,b, hasilkomparasi);
         
         a = 12;
         b = 10;
         
         hasilkomparasi = (a < b);
         System.out.printf("%d < %d --> %s \n",a,b, hasilkomparasi);
        
         //operator greater than atau lebih dari 
         System.out.println("------------lebih dari------------");
         a = 10;
         b = 10;
         
         hasilkomparasi = (a > b);
         System.out.printf("%d > %d --> %s \n",a,b, hasilkomparasi);
         
         a = 12;
         b = 10;
         
         hasilkomparasi = (a > b);
         System.out.printf("%d > %d --> %s \n",a,b, hasilkomparasi);
        
         //operator less than equal atau kurang dari sama dengan 
         System.out.println("------------kurang dari sama dengan------------");
         a = 9;
         b = 10;
         
         hasilkomparasi = (a <= b);
         System.out.printf("%d <= %d --> %s \n",a,b, hasilkomparasi);
         
         a = 10;
         b = 10;
         
         hasilkomparasi = (a <= b);
         System.out.printf("%d <= %d --> %s \n",a,b, hasilkomparasi);
         
         a = 12;
         b = 10;
         
         hasilkomparasi = (a <= b);
         System.out.printf("%d <= %d --> %s \n",a,b, hasilkomparasi);
        
         //operator greater than equal atau lebih dari sama dengan
         System.out.println("------------lebih dari sama dengan------------");
         a = 9;
         b = 10;
         
         hasilkomparasi = (a >= b);
         System.out.printf("%d >= %d --> %s \n",a,b, hasilkomparasi);
         
         a = 9;
         b = 10;
         
         hasilkomparasi = (a >= b);
         System.out.printf("%d >= %d --> %s \n",a,b, hasilkomparasi);
         
         a = 12;
         b = 10;
         
         hasilkomparasi = (a >= b);
         System.out.printf("%d >= %d --> %s \n",a,b, hasilkomparasi);
        
    }
    
}
