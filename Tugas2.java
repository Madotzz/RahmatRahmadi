package struktur_data;
import java.util.*;
public class Tugas2 {
    public static void main(String[] args) {
//      5 metode mencetak isi array
        int[] data = {100,200,300,400,500};
        
        System.out.println("Mencetak mengunakan loop for : ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        
        System.out.println("Mencetak menggunakan for each : ");
        for (int angka : data) {
            System.out.println(angka);
        }
        
        System.out.println("Mencetak menggunakan metode Arrays.toString() : ");
        System.out.println(Arrays.toString(data));
        
        System.out.println("Mencetak menggunakan metode Arrays.asList() : ");
        System.out.println(Arrays.asList(data));
        
        System.out.println("Mencetak menggunakan Java 8 Stream API : ");
        Arrays.stream(data).forEach(System.out::println);
    }
}
