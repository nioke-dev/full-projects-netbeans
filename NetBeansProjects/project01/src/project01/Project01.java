package project01;

class biodata1{
    String nama;
    int kelas;
    String jurusan;
    String alamat;

//    public biodata1() {
//        System.out.println("nama = "+nama);
//        System.out.println("kelas = "+kelas);
//        System.out.println("jurusan = "+jurusan);
//        System.out.println("nama = "+alamat);

    }
    
    
//}
   
public class Project01{

//firts java   
    //procedure parameter
   // static void saya(String nama){
   //     System.out.println("Nama : " + nama);
    //}
     // tanpa void
/*    static int penjumlahan(int x, int y) {
        int z = x + y;
        return z;
    }*/
    // tanpa static
//    public void ucap(String kata) {
//        System.out.println("Ucapkan " + kata);
//    }
    
    /*public void menu (){
        Scanner s = new Scanner(System.in);
        String nama;
        System.out.print("Masukan nama : ");
        nama = s.next();
        System.out.println("Nama : " + nama);
    }
    public void menu_1 (){
        Scanner s = new Scanner(System.in);
        String Kelas;
        System.out.print("Masukan kelas : ");
        Kelas = s.next();
        System.out.println("Kelas : " + Kelas);
    }
    public void alamat(){
        Scanner al = new Scanner(System.in);
        String almt;
    }
    
   */
    
    class biodata{
     String nama1;
     int kelas;
     String jurusan;  
     
     
    }
    
    
    public static void main(String[] args) {  
        
     biodata1 saya = new biodata1();
     saya.nama ="samsul h";
     saya.alamat="sumber kerang";
     saya.kelas= 10;
     saya.jurusan="rpl";
        System.out.println("namanya\t= "+saya.nama);
        System.out.println("alamat\t= "+saya.alamat);
        System.out.println("kelas\t= "+saya.kelas);
        System.out.println("jurusan\t= "+saya.jurusan);
        System.out.println("\n");
        biodata1 sy = new biodata1();
     sy.nama ="husnul kh";
     sy.alamat="blado wetan";
     sy.kelas= 10;
     sy.jurusan="rpl";
        System.out.println("namanya\t= "+sy.nama);
        System.out.println("alamat\t= "+sy.alamat);
        System.out.println("kelas\t= "+sy.kelas);
        System.out.println("jurusan\t= "+sy.jurusan);

   /* //project
    Project01 sc = new Project01();
    sc.menu();
    Project01 kl = new Project01();
    kl.menu_1();



//saya("Joni");
    //    System.out.println("Hasil = " + penjumlahan(3,2));
        
       // Project01 p = new Project01();
        // p.ucap("Hello dunia");
        
        
      */  
        
        
        
        
        
        
        
        
        
    
       // System.out.println("SAM X");
       
       /* System.out.print ("SAM X");
        System.out.print ("yes ");
        System.out.print ("no ");*/
             
       /* System.out.println("Hello penjumlahan");
        int a = 4 ;
        int b = 2 ;
        int c = a + b;
        System.out.println("hasilnya c " +c);*/

      /*  System.out.println ("Hello perkalian dan pembagian");
        int a, b, c, d, e, f;
        a = 3;
        b = 7;
        c = a * b;
        System.out.println("hasil c = "+ c);
        //
        d = 8;
        e = 4;
        f = d / e;
        System.out.println("hasil f = "+ f);*/
      
      
      //mencari luas persegi panjang
    /*  int panjang, lebar, luas;
      panjang = 8;
      lebar   = 6;
      luas    = panjang*lebar;
      System.out.println("luasnya adalah = "+ luas);
  
      //mencari luas segitiga
      int alas, tinggi, luas_segitiga;
      alas   = 6 ;
      tinggi = 10;
      luas_segitiga = alas * tinggi / 2 ;
      System.out.println("luas segitiganya adalah = "+luas_segitiga);
 
  
      //mencari luas lingkaran
      int r ,luas_ligkaran;
      r = 7 ;
      luas_ligkaran = r*r*22/7;
        System.out.println("luas lingkaran trsbt = "+ luas_ligkaran);
        System.out.println("");
        System.out.println("===========================");*/
    //scanner switch and case
    /*Scanner sc = new Scanner(System.in);  
    //tipe data
    int menu, pesan, total;
    
    //pilihan menu
        System.out.println("MENU : ");
        System.out.println("1. ayam goreng");
        System.out.println("2. bebek goreng");
        System.out.println("3. ayam geprek");
        System.out.println("4. es teh");
        System.out.println("5. jus jeruk nipis");
        System.out.println("");
        System.out.print("Pillih MENU apa =  ");
         menu = sc.nextInt();
    //pengkondisian
    switch (menu){
            case 1:
                System.out.println("anda memesan AYAM GORENG");   
                System.out.print("pesan berapa ? ");
                pesan = sc.nextInt();
                total = pesan * 15000;
                System.out.println("totalnya = "+total);
                System.out.println("");
                        
                        System.out.println("pilih MENU = ");
                        System.out.println("1. ayam goreng");
                        System.out.println("2. bebek goreng");
                        System.out.println("3. ayam geprek");
                        System.out.println("4. es teh");
                        System.out.println("5. jus jeruk nipis");
                        System.out.println("");
                        System.out.print("Pillih MENU apa =  ");
                        menu = sc.nextInt();
                //switch bersarang
                switch(menu){
                    case 1:
                        System.out.println("anda memesan AYAM GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 15000;
                        System.out.println("totalnya = "+total); 
                    case 2:
                        System.out.println("anda memesan BEBEK GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 20000;
                        System.out.println("totalnya = "+total);
                        break;
                    case 3:
                       System.out.println("anda memesan AYAM GEPREK");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 4:
                       System.out.println("anda memesan ES TEH");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 5:
                       System.out.println("anda memesan JUS JERUK NIPIS");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 4000;
                       System.out.println("totalnya = "+total);
                       break; 
                     default:
                        System.out.println("MAAF !!! MENU YANG ANDA PESAN TIDAK ADA");
                           }
                       break;
        case 2:
            System.out.println("anda memesan BEBEK GORENG");   
            System.out.print("pesan berapa ? ");
            pesan = sc.nextInt();
            total = pesan * 20000;
            System.out.println("totalnya = "+total);
            System.out.println("");
                        System.out.println("mau pesan lagi ? ");
                        System.out.println("pilih MENU = ");
                        System.out.println("1. ayam goreng");
                        System.out.println("2. bebek goreng");
                        System.out.println("3. ayam geprek");
                        System.out.println("4. es teh");
                        System.out.println("5. jus jeruk nipis");
                        System.out.println("");
                        System.out.print("Pillih MENU apa =  ");
                        menu = sc.nextInt();
                //switch bersarang
                switch(menu){
                    case 1:
                        System.out.println("anda memesan AYAM GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 15000;
                        System.out.println("totalnya = "+total); 
                    case 2:
                        System.out.println("anda memesan BEBEK GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 20000;
                        System.out.println("totalnya = "+total);
                        break;
                    case 3:
                       System.out.println("anda memesan AYAM GEPREK");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 4:
                       System.out.println("anda memesan ES TEH");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 5:
                       System.out.println("anda memesan JUS JERUK NIPIS");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 4000;
                       System.out.println("totalnya = "+total);
                       break; 
                     default:
                        System.out.println("MAAF !!! MENU YANG ANDA PESAN TIDAK ADA");
                           }
                       
             break;
        case 3:
            System.out.println("anda memesan AYAM GEPREK");   
            System.out.print("pesan berapa ? ");
            pesan = sc.nextInt();
            total = pesan * 15000;
            System.out.println("totalnya = "+total);
            System.out.println("");
                        System.out.println("mau pesan lagi ? ");
                        System.out.println("pilih MENU = ");
                        System.out.println("1. ayam goreng");
                        System.out.println("2. bebek goreng");
                        System.out.println("3. ayam geprek");
                        System.out.println("4. es teh");
                        System.out.println("5. jus jeruk nipis");
                        System.out.println("");
                        System.out.print("Pillih MENU apa =  ");
                        menu = sc.nextInt();
                //switch bersarang
                switch(menu){
                    case 1:
                        System.out.println("anda memesan AYAM GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 15000;
                        System.out.println("totalnya = "+total); 
                    case 2:
                        System.out.println("anda memesan BEBEK GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 20000;
                        System.out.println("totalnya = "+total);
                        break;
                    case 3:
                       System.out.println("anda memesan AYAM GEPREK");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 4:
                       System.out.println("anda memesan ES TEH");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 5:
                       System.out.println("anda memesan JUS JERUK NIPIS");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 4000;
                       System.out.println("totalnya = "+total);
                       break; 
                     default:
                        System.out.println("MAAF !!! MENU YANG ANDA PESAN TIDAK ADA");
                           }
                       break; 
        case 4:
            System.out.println("anda memesan ES TEH");   
            System.out.print("pesan berapa ? ");
            pesan = sc.nextInt();
            total = pesan * 15000;
            System.out.println("totalnya = "+total);
            System.out.println("");
                        System.out.println("mau pesan lagi ? ");
                        System.out.println("pilih MENU = ");
                        System.out.println("1. ayam goreng");
                        System.out.println("2. bebek goreng");
                        System.out.println("3. ayam geprek");
                        System.out.println("4. es teh");
                        System.out.println("5. jus jeruk nipis");
                        System.out.println("");
                        System.out.print("Pillih MENU apa =  ");
                        menu = sc.nextInt();
                //switch bersarang
                switch(menu){
                    case 1:
                        System.out.println("anda memesan AYAM GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 15000;
                        System.out.println("totalnya = "+total); 
                    case 2:
                        System.out.println("anda memesan BEBEK GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 20000;
                        System.out.println("totalnya = "+total);
                        break;
                    case 3:
                       System.out.println("anda memesan AYAM GEPREK");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 4:
                       System.out.println("anda memesan ES TEH");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 5:
                       System.out.println("anda memesan JUS JERUK NIPIS");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 4000;
                       System.out.println("totalnya = "+total);
                       break; 
                     default:
                        System.out.println("MAAF !!! MENU YANG ANDA PESAN TIDAK ADA");
                           }
                       break;  
        case 5:
            System.out.println("anda memesan JUS JERUK NIPIS");   
            System.out.print("pesan berapa ? ");
            pesan = sc.nextInt();
            total = pesan * 4000;
            System.out.println("totalnya = "+total);
             System.out.println("");
                        System.out.println("mau pesan lagi ? ");
                        System.out.println("pilih MENU = ");
                        System.out.println("1. ayam goreng");
                        System.out.println("2. bebek goreng");
                        System.out.println("3. ayam geprek");
                        System.out.println("4. es teh");
                        System.out.println("5. jus jeruk nipis");
                        System.out.println("");
                        System.out.print("Pillih MENU apa =  ");
                        menu = sc.nextInt();
                //switch bersarang
                switch(menu){
                    case 1:
                        System.out.println("anda memesan AYAM GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 15000;
                        System.out.println("totalnya = "+total); 
                    case 2:
                        System.out.println("anda memesan BEBEK GORENG");   
                        System.out.print("pesan berapa ? ");
                        pesan = sc.nextInt();
                        total = pesan * 20000;
                        System.out.println("totalnya = "+total);
                        break;
                    case 3:
                       System.out.println("anda memesan AYAM GEPREK");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 4:
                       System.out.println("anda memesan ES TEH");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 15000;
                       System.out.println("totalnya = "+total);
                       break;   
                    case 5:
                       System.out.println("anda memesan JUS JERUK NIPIS");   
                       System.out.print("pesan berapa ? ");
                       pesan = sc.nextInt();
                       total = pesan * 4000;
                       System.out.println("totalnya = "+total);
                       break; 
                     default:
                        System.out.println("MAAF !!! MENU YANG ANDA PESAN TIDAK ADA");
                           }
                       break;   
        default:
            System.out.println("MAAF !!! MENU YANG ANDA PESAN TIDAK ADA");
             break;*/
    
    

                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        
        
        /*System.out.println("============================");
        System.out.println  ("      WELCOME TO HOME");
        System.out.println  ("============================");
        System.out.print    ("USERNAME :");
        System.out.println  (" SAMSUL  HADI");
        System.out.print    ("PASSWORD :");
        System.out.println  (" ASSALAMUALIKUM");*/
        
        
        /*int x, y, luas;        x=7;
        y=13;
        luas = x*y;
        System.out.println("luas persegi panjang");
        System.out.println(luas+" hasilnya");
        
        if (luas %2==0){
        System.out.println("genap");
        }
        else{
        System.out.println("ganjil");
        }*/
        
        
      //  for (int i = 5; i < 15; i++) {
      //      System.out.println("ini "+i);
            
        
        
      
    }     
  }
    

