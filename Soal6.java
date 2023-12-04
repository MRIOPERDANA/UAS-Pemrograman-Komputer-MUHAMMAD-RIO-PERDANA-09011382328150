import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String x = input.nextLine();

        if (Palindrome(x)) {
            System.out.println("'" + x + "' adalah palindrom.");
        } else {
            System.out.println("'" + x + "' bukan palindrom.");
        }
        input.close();
    }

    private static boolean Palindrome(String y) {
        // Menghapus spasi dan mengubah menjadi huruf kecil
        y = y.replaceAll("\\s+", "").toLowerCase();

        int length = y.length();
        for (int i = 0; i < length / 2; i++) {
            if (y.charAt(i) != y.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
