package struktur_data;
import java.util.*;
public class Tugas3 {
    public static void main(String[] args) {
//      Membuat array 2D kemudian menginput nilai menggunakan Scanner
        Scanner input = new Scanner(System.in);
        int[][] data = new int[2][2];
        
//      Menginput nilai array 2D
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Masukkan angka : ");
                data[i][j] = input.nextInt();
            }
        }
        
//      Mencetak isi array 2D
        System.out.println(Arrays.deepToString(data));
        
    }
}
