
package format_string;

import java.util.Formatter;

public class main {

    public static void main(String[] args) {
        String nama  = "udin";
        int umur = 17;
        
        //output = nama saya adlah udin, umur saya adalah 17
        
        System.out.println("nama saya adalah " + nama + ", umur saya adalah " + umur);
        
        //cara lainnya adalah dengan format string
        System.out.printf("nama saya adalah %s, umur saya adalah %d",nama,umur);
        
        //conversation = f = floating point, d = integer, c = character, s = String, b = boolean
        
        //struktur format = [%argumen_indeks$] [flags] [width] [.precission] conversation
        
        // [%argumen_indeks$]
        System.out.println("\n[%argumen_indeks$]");
        
        //udin wahai udin kemana saja kamu udin
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s\n",nama);
        //umur udin berapa?, udin menjawab: 17, wah masih muda yah umurnya 17
        System.out.printf("umur %1$s berapa ?, %1$s menjawab: %2$d,\nwah masih muda yah umurnya %2$d",nama,umur);
        
        //[flags]
        System.out.println("\nflags");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d  %d = %+d\n",int1,int2,hasil);
        
        //[WIDTH]
        System.out.println("[WIDTH]\n");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3);//flags = "-", artinya rata kiri
        System.out.printf("%+5d\n",int3);// flags akan mengambil slot didalam format
        System.out.printf("%+-6d\n",int3);//flags bisa digabungkan
        System.out.printf("%10d\n",int3);
        System.out.printf("% 10d\n",int3);
        System.out.printf("%010d\n",int3);//flags = "0" kita tambahkan leading "0"di depan
        System.out.printf("%+010d\n",int3);
        int int4 = 1000000000;
        System.out.printf("%-,10d\n",int4);//flags = "," menandatakan delimeter per seribu
        
        System.out.println("\nFLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n",float1);
        System.out.printf("%+9f\n",float1);//floating point akan mengambil width dengan 6 decimal
        
         //[precisson]
        System.out.println("[.precission]\n");
        float float2 = 15.678f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%8.2f\n",float2);//gabungkan dengan width
        System.out.printf("%08.2f\n",float2);//gabungkan dengan with dan flags
        
        //contoh
        
        String nama2 = "ucup";
        float IPK = 3.751234567653f;
        
        //struktur format = [%argumen_indeks$] [flags] [width] [.precission] conversation
        System.out.printf("\nIPK %1$s berapa?,\n%1$s: saya dapet %2%+5.2f",nama2,IPK);
        
        //kesimpulan
        
        //save format ini kedalam variable string
        String info_biasa = "nama:" +nama2 + ", IPK = " + IPK;
        System.out.println("biasa ->" + info_biasa);
        
        String info_format = String.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("string format --> " + info_format);
        
        //save format ini kedalam string builder
        
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);
        
        formatBuilder.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("String Builder format --> " + builder_info);
        
    }
    
}
