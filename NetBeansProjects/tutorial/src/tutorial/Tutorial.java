package tutorial;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {
    // luas persegi panjang
        /* Scanner userInput = new Scanner(System.in);
        int p, l;
        int luas;
        System.out.print("masukan panjang : ");
        p = userInput.nextInt();
        System.out.print("masukan lebar : ");
        l = userInput.nextInt();
        luas = p * l;
        System.out.println("luas = " + luas);
        */
        
        // operator logika /gerbang logika
        // && || !
        /*int angka = 9;
        if (angka < 5 && angka > 1) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }*/
        
        
        //int nilai = 90;
        
        /*if (nilai >= 90 && nilai <= 100) {
            System.out.println("Predikat = A");
        } else if (nilai >= 80 && nilai < 90) {
            System.out.println("Predikat = B");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("Predikat = C");
        } else {
            System.out.println("Predikat anda tidak ada");
        }*/
        
        /* int x = 4;
        System.out.println(x < 3 || x >= 4); */
        
        
        // AND == perkalian
        // a b c
        // 1 1 1
        // 0 1 0
        // 1 0 0
        // 0 0 0
        
        // OR == penjumlahan
        // a b c
        // 1 1 1
        // 0 1 1
        // 1 0 1
        // 0 0 0
        
        // NOT == bukan
        // a b c
        // 1 1 0
        // 0 1 1
        // 1 0 1
        // 0 0 0
        
        
        
        
        
        
        // program untuk menentukan kelulusan
        /*int nilai = 80;
        
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("anda lulus");
        }else if (nilai >=80 && nilai < 90 ) {
            System.out.println("tidak lulus");
        }else
          /  System.out.println("sarah"); */
        
        // program untuk menentukan diskon
//        int pembelian = 10;
//        
//        if (pembelian >= 2 && pembelian <= 5){
//            System.out.println("selamat anda mendapatkan diskon 25% ");
//        }else if (pembelian >= 10 && pembelian <= 20){
//            System.out.println ("selamat anda mendapatkan diskon 60%");
//        }else{
//        System.out.println("maaf anda tidak mendapatkan diskon");
//                }
//        
        
        
        
        
        
        // NOT 
        /*int x = 20;
        System.out.println(x != 20); 
        
        // switch
        int nilai = 3;
        switch(nilai) {
            case 1:
                System.out.println("1");
                break;
            case 2: 
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("angka yang anda cari tidak ada");
                break;
        }*/
        
        
        //PROGRAM KASIR
        /*Scanner input = new Scanner(System.in);
        int menu;
        int porsi, harga, bayar;
        System.out.println("================= TOKO MAKMUR ========================");
        System.out.println("1. Kambing Bakar");
        System.out.println("2. Manusia Bakar");
        System.out.print("Pilih Menu : ");
        menu = input.nextInt();
        switch(menu) {
            case 1:
                System.out.println("Pesanlah Kambing Bakar");
                System.out.print("Masukan jumlah porsi : ");
                porsi = input.nextInt();
                harga = 5000;
                bayar = porsi * harga;
                System.out.println("Total Bayar = " + bayar);
                System.out.println("Mau pesan lagi ?");
                System.out.println("1. Kambing Bakar");
                System.out.println("2. Manusia Bakar");
                System.out.print("Pilih Menu : ");
                menu = input.nextInt();
                switch(menu) {
                    case 1:
                        System.out.println("Pesanlah Kambing Bakar");
                        System.out.print("Masukan jumlah porsi : ");
                        porsi = input.nextInt();
                        harga = 5000;
                        bayar = porsi * harga;
                        System.out.println("Total Bayar = " + bayar);
                        break;
                    case 2:
                        System.out.println("Pesanlah Manusia Bakar");
                        System.out.print("Masukan jumlah porsi : ");
                        porsi = input.nextInt();
                        harga = 2000;
                        bayar = porsi * harga;
                        System.out.println("Total Bayar = " + bayar);
                        break;
                    default:
                        break;
                        }
            case 2:
                System.out.println("Pesanlah Manusia Bakar");
                System.out.print("Masukan jumlah porsi : ");
                porsi = input.nextInt();
                harga = 2000;
                bayar = porsi * harga;
                System.out.println("Total Bayar = " + bayar);
                break;
            default:
                System.out.println("Anda tidak memilih apa apa");
                break;
        }*/
        
        
        /*Scanner input = new Scanner(System.in);
        String menu;
        
        System.out.println("----TOKO NURUL DAN TETEH----");
        System.out.println("1. Cinta");
        System.out.println("2. Dusta");
        System.out.println("3. Membara");
        System.out.print("Masukan cintamu : ");
        menu = input.next();
        // cek
        
        if (menu.equals("cinta")) {
            System.out.println("ini cintaku");
        } else if (menu.equals("dusta")) {
            System.out.println("ini dustaku");
        } else if (menu.equals("membara")) {
            System.out.println("ini membara");
        } else {
            System.out.println("kau tak mencintaiku, tai !!");
        }*/
        
        // switch
        /*int a = 2;
        // if
        if (a == 1) {
            System.out.println("benar");
        } else if (a == 2) {
            System.out.println("a = 2");
        }
        
        switch(a) {
            case 1:
                System.out.println("benar");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("angka tidak ada");
                break;
        }*/
        
        //progra kasir 1
        Scanner input = new Scanner(System.in);
        int menu;
        int porsi, harga, bayar;
        System.out.println("toko serba halal");
        System.out.println("1. milk");
        System.out.println("2. banana");
        System.out.print("pilih menu : ");
        menu =input.nextInt();
        switch (menu){
            case 1 :
                System.out.println("pesan milk");
                System.out.print("masukkan jumlah porsi : ");
                porsi = input.nextInt();
                harga  = 2500;
                bayar = porsi * harga;
                System.out.println("total bayar :" + bayar);
                break;
                
            case 2 :
                System.out.println("pesan banana");
                System.out.print("masukkan jumlah porsi : ");
                porsi = input.nextInt();
                harga  = 3000;
                bayar = porsi * harga;
                System.out.println("total bayar :" + bayar);
                break;
                default:
                    System.out.println("anda tidak memilih apa apa");
                break;
       
       
       //Restoran NELONGSO
       /*Scanner input = new Scanner (System.in);
       int porsi, harga, pembayaran, menu;
        System.out.println("============RESTORAN CODEkita");
        System.out.println("MENU :");
        System.out.println("1.hamburger");
        System.out.println("2.potato crispy");
        System.out.println("3.tempe goreng");
        System.out.println("4.es teh");
        System.out.println("5.kopi");
        System.out.print("silahkan pilih menu : ");
        menu =input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("humberger");
                System.out.println("Masukan jumlah porsi = ");
                porsi = input.nextInt();
                harga = 7000;
                pembayaran = porsi*harga;
                System.out.println("total yang dibayar : "+ pembayaran);
                break;
             
                
                
            case 2:
                System.out.print("potato crispy");
                System.out.print("Masukan jumlah porsi");
                porsi = input.nextInt();
                harga = 5000;
                pembayaran = porsi*harga;
                System.out.println("total yang dibayar : "+ pembayaran);
                break;
            case 3:
                System.out.print("tempe goreng ");
                System.out.print("Masukan jumlah porsi : ");
                porsi = input.nextInt();
                harga = 3000;
                pembayaran = porsi*harga;
                System.out.println("total yang dibayar : "+ pembayaran);
                break;
            case 4:
                System.out.print("es teh");
                System.out.print("Masukan jumlah porsi : ");
                porsi = input.nextInt();
                harga = 7000;
                pembayaran = porsi*harga;
                System.out.print("total yang dibayar : "+ pembayaran);
                break;
            case 5:
                System.out.print("kopi");
                System.out.print("Masukan jumlah porsi : ");
                porsi = input.nextInt();
                harga = 7000;
                pembayaran = porsi*harga;
                System.out.println("total yang dibayar : "+ pembayaran);
                break;
            default:
                System.out.println("anda nyasar");
                break;
        }*/
       
       
       
       /*int nomer_menu, item;
       Scanner inputUser = new Scanner(System.in);
       System.out.println("TOKO ABADI");
        System.out.println("1. Baju");
        System.out.println("2. Celana");
        System.out.println("3. Daleman");
        System.out.print("Pilih item yang akan dibeli : ");
        nomer_menu = inputUser.nextInt();
        switch(nomer_menu) {
            case 1:
                System.out.println("Yang anda pilih menu baju");
                System.out.print("Silahkan masukan itemnya : ");
                item = inputUser.nextInt();
                System.out.println("Item yang ada beli sebanyak " + item);
                break;
            case 2:
                System.out.println("Yang anda pilih menu celana");
                System.out.print("Silahkan masukan itemnya : ");
                item = inputUser.nextInt();
                System.out.println("Item yang ada beli sebanyak " + item);
                break;
            case 3:
                System.out.println("Yang anda pilih menu daleman");
                System.out.print("Silahkan masukan itemnya : ");
                item = inputUser.nextInt();
                System.out.println("Item yang ada beli sebanyak " + item);
                break;
            default:
                System.out.println("Menu yang anda pilih tidak ada");
                break;

        }*/
       
       
        /*for (int x = 5; x <= 10; x++) {
            System.out.println("x ke-" + x);
        }*/
        
        
        // int x = 1;
        /*while (x <= 10) {
            System.out.println("ini x ke-"+ x);
            x++;
        }*/
        
        /*do {
            System.out.println("ini x ke-" + x);
            x++;
        } while (x <= 10);*/
       
        
//        Scanner inp = new Scanner(System.in);
//        System.out.println("1.Avanza");
//        System.out.println("2.Mobilio");
//        System.out.print("Masukan nama mobil : ");
//        String nm_mobil = inp.next();
//        System.out.println("1.Avanza");
//        System.out.println("2.Mobilio");
//        System.out.println("3." + nm_mobil);
        
        
        
       
       
       
       
       
       
       
       
           
        
                

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
    }   
}
