package struktur_data;
import java.util.*;
public class Struktur_Data {
    public static void main(String[] args) {
//      Array 1D bertipe data primitif
        int[] a = new int[5];
        
//      Mengisi nilai pada indeks array 1D bertipe data primitif
        a[0] = 22;
        a[1] = 56;
        a[2] = 88;
        a[3] = 11;
        a[4] = 99;
        
//      Array 1D bertipe data non primitif
        Integer[] b = new Integer[5];
        
//      Mengisi nilai pada indeks array 1D bertipe data non primitif
        b[0] = 34;
        b[1] = 25;
        b[2] = 58;
        b[3] = 96;
        b[4] = 41;
        
//      Array 2D bertipe data primitif
        double[][] c = new double[2][2];
        
//      Mengisi nilai pada indeks array 2D bertipe data primitif
        c[0][0] = 11.4;
        c[0][1] = 22.3;
        c[1][0] = 33.2;
        c[1][1] = 44.1;
        
//      Mencetak array 1D bertipe data primitif
        System.out.println(Arrays.toString(a));
        
//      Mencetak array 1D bertipe data non primitif
        System.out.println(Arrays.toString(b));
        
//      Mencetak array 2D bertipe data primitif
        System.out.println(Arrays.deepToString(c));
    }
    
}
