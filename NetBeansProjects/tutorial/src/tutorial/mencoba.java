package tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class mencoba {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        //tugas
//        cara serching dengan data sembarang pake looping
//        sorting secara descending pake looping
//        melakukan operasi tambah dua buah arrray bikin fungsi pake copy of
//        menggabungkan dua buah array

        //searching dengan data sembarang
        int array1[] = {5,3,1,6,7,9,2,4,8,};
        int cari;

        System.out.print("Masukan angka dicari [1 - 9]: ");
        cari = inputUser.nextInt();

        fungsiCari(array1,cari);

        System.out.println(Arrays.toString(array1));
        //4,2,6,4,7,3,21,14,51,14,1,23,44,15,16,13,1

        // Sorting secara descending
        int array2[] = {1,8,7,9,6,4,2,3,5,1};
        urutkan(array2);

        // Operasi penambahan
        // dua buah array
        int array3[] = {1,2,3,4,5};
        int array4[] = {1,2,3,4,5};

        tambah(array3,array4);

        gabung(array3,array4);
    }

    //fungsi untuk mencari array
    private static void fungsiCari(int dataArray[],int dicari){
        for(int i = 0; i < dataArray.length; i++){
            if(dataArray[i] == dicari){
                System.out.println(dataArray[i]+" berada di index ke-"+ i);
            }
        }
    }

    //fungsi sorting
    private static void urutkan(int dataArray[]){
        int tukar;
        System.out.println(Arrays.toString(dataArray));

        for(int i = 0; i < dataArray.length; i++){
            for(int j = i + 1; j < dataArray.length; j++){

                if (dataArray[i] < dataArray[j]) {
                    tukar = dataArray[i];
                    dataArray[i] = dataArray[j];
                    dataArray[j] = tukar;
                }
            }
        }

        System.out.println(Arrays.toString(dataArray));
    }

    // Penmabahan dua buah array
    private static void tambah(int dataArray1[], int dataArray2[]){
        int hasil[] = new int[5];
        System.out.println(Arrays.toString(dataArray1));
        System.out.println(Arrays.toString(dataArray2));
        System.out.println("-----------------+");
        for(int i = 0; i < dataArray1.length; i++){
            hasil[i] = dataArray1[i] + dataArray2[i];
        }

        System.out.println(Arrays.toString(hasil));
    }

    //penggabungan
    private static void gabung(int dataArray1[], int dataArray2[]){
        int hasil[] = new int[10];
        for(int i = 0; i < (dataArray1.length + dataArray2.length); i++){
            if(i < 5){
                hasil[i] = dataArray1[i];
            } else {
                hasil[i] = dataArray2[i-dataArray1.length];
            }
        }

        System.out.println(Arrays.toString(hasil));
    }
}
    
    

