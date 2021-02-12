
package oop_java;

public class Senjata_oop {

    int jumlah_peluru = 10;
    
    public void menembak() {
        System.out.println("Jumlah peluru awal = " + jumlah_peluru);
    }
    
    public void sisa_peluru() {
        jumlah_peluru = jumlah_peluru - 1;
        System.out.println("Sisa peluru = " + jumlah_peluru);
    }
    
    public static void main(String[] args) {
        Senjata_oop s = new Senjata_oop();
        s.menembak();
        s.sisa_peluru();
        
    }
    
}
