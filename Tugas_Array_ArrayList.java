package struktur_data;
import java.util.*;
public class Tugas_Array_ArrayList {
    public static void main(String[] args) {
//1.    Array 1D bertipe data primitif
        byte[] data1 = {1,2,3,4,5};
        
        short[] data2 = {32,33,54,44,66};
        
        int[] data3 = {43,66,78,99,100};
        
        long[] data4 = {1000,3232,6645,7965};
        
        float[] data5 = {182.3f,233.3f,585.0f};
        
        double[] data6 = {128.3,193.4,854.4,670.7};
        
        char[] data7 = {'A','B','C','D','E'};
        
        boolean[] data8 = {true,false,false,true,true};


//2.      5 metode mencetak isi array
        int[] angka = {100,200,300,400,500};
        
        System.out.println("Mencetak mengunakan loop for : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        
        System.out.println("\nMencetak menggunakan for each : ");
        for (int item : angka) {
            System.out.print(item + " ");
        }
        
        System.out.println("\nMencetak menggunakan metode Arrays.toString() : ");
        System.out.println(Arrays.toString(angka));
        
        System.out.println("Mencetak menggunakan metode while : ");
        int a = 0;
        while (a < data2.length ){
            System.out.print(angka[a] + " ");
            a++;
        }
        
        System.out.println("\nMencetak menggunakan metode do-while : ");
        int b = 0;
        do {
            System.out.print(angka[b] + " ");
            b++;
        } while (b < angka.length);   
        System.out.println();
        
//3.      Membuat array 2D kemudian menginput nilai menggunakan Scanner
        Scanner input = new Scanner(System.in);
        int[][] data = new int[2][2];
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Masukkan angka : ");
                data[i][j] = input.nextInt();
            }
        }  
        
        System.out.println(Arrays.deepToString(data));
        
        
//4.      Membuat ArrayList bertipe Wrapper
        ArrayList<Float> angka2 = new ArrayList<>();
        
        angka2.add(23.55f);
        angka2.add(123.1f);
        angka2.add(66.7f);
        angka2.add(457.2f);
        angka2.add(1000.1f);
        
        System.out.println(angka2);
        
        
//      Membuat ArrayList bertipe data Integer dan lakukan proses add(), get(), set(), remove(), size()
        ArrayList<Integer> angka3 = new ArrayList<>();
        
        angka3.add(123);
        angka3.add(234);
        angka3.add(487);
        angka3.add(9327);
        angka3.add(4568);
        
        System.out.println("List Angka : " + angka3);
        
        System.out.println("Indeks ke-4 : " + angka3.get(4));
        
        angka3.set(2, 1000);
        System.out.println("List angka setelah mengganti indeks ke-2 : " + angka3);
        
        angka3.remove(3);
        System.out.println("List angka setelah menghapus indeks ke-3 : " + angka3);
        
        System.out.println("Ukuran ArrayList : " + angka3.size());
    }
}
