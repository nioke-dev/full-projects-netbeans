
package overload_function;
public class main {
    public static void main(String[] args) {
        
        
        int hasilInteger;
        hasilInteger = (int) tambah(4, 5);
        printAngka(hasilInteger);
        
        float hasilFloat;
        
        hasilFloat = tambah(4.5f, 4);
        printAngka(hasilFloat);
        
        hasilFloat = tambah(4, 4.5f);
        printAngka(hasilFloat);
        
        hasilInteger = tambah(11, 12, 13);
        printAngka(hasilInteger);
        
        printAngka(10);
        printAngka(10.5f);
        printAngka(10.7d);
        printAngka(16);
        
    }
    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    
    private static float tambah(int angkaInt2, float angkaFloat1){
        return angkaFloat1 + angkaInt2;
    }
    private static float tambah(float angkaFloat1, int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }
    private static float tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }
    private static void printAngka(double angkaDouble){
        System.out.println("angka ini adalah double dengan nilai = " + angkaDouble);
    }
    private static void printAngka(float angkaFloat){
        System.out.println("angka ini adalah double dengan nilai = " + angkaFloat);
    }
    private static void printAngka(int angkaInt){
        System.out.println("angka ini adalah double dengan nilai = " + angkaInt);
    }
    
    
    
}
