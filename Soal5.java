import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("1. Penjumlahan \t (+)");
        System.out.println("2. Pengurangan \t (-)");
        System.out.println("3. Perkalian   \t (*)");
        System.out.println("4. Pembagian   \t (/)");
        
        System.out.println("Pilih operasi (1/2/3/4)");
        int operasi = input.nextInt();

        if (operasi == 1){
            System.out.println("User memilih Penjumlahan");
        } 
        else if (operasi == 2){
            System.out.println("User memilih pengurangan");
        }
        else if (operasi == 3){
            System.out.println("User memilih perkalian");
        }
        else if (operasi == 4){
            System.out.println("User memilih pembagian");
        } else ;{
            System.out.println("Tidak valid");
        }

    int penjumlahan  = x + y;
    int pengurangan  = x - y;
        if (operasi == 1){
            System.out.println("Hasil operasi : " + penjumlahan);
        } 
        else if (operasi == 2){
            System.out.println("Hasil operasi dari : " + pengurangan);
        }
        else if (operasi == 3){
            System.out.println("Hasil operasi dari : " + x * y);
        }
        else if (operasi == 4){
            System.out.println("Hasil operasi dari : " + x / y);
        } else ;{
            System.out.println("Tidak valid");
        }
        input.close();

      

    }
}

