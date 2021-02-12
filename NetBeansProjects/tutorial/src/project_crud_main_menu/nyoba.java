/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_crud_main_menu;

import java.util.Scanner;

/**
 *
 * @author NIOKE
 */
public class nyoba {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        boolean jurusan = true;
        while (jurusan) {
            System.out.println("==DAFTAR JURUSAN==");
            System.out.println("1. rpl");
            System.out.println("2. tkr");
            System.out.println("3. titl");
            System.out.println("4. tpmi");
            System.out.println("5. tb");
            System.out.println("silahkan masukkan angka \npada jurusan yang anda pilih : ");
            
            String pilihan_user;
            pilihan_user = userInput.next();
            switch(pilihan_user){
                case "1" :
                    System.out.println("==========");
                    System.out.println("RPL");
                    System.out.println("==========");
                    break;
                case "2" :
                    System.out.println("==========");
                    System.out.println("tkr");
                    System.out.println("==========");
                    break;
                case "3" :
                    System.out.println("==========");
                    System.out.println("titl");
                    System.out.println("==========");
                    break;
                case "4" :
                    System.out.println("==========");
                    System.out.println("tpmi");
                    System.out.println("==========");
                    break;
                case "5" :
                    System.out.println("==========");
                    System.out.println("tb");
                    System.out.println("==========");
                    break;
                default:
                    System.err.println("data tidak ditemukan");
            }
            
            
        }
        
    }
}
