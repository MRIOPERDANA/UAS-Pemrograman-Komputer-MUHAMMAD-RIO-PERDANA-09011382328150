import java.util.Scanner;

public class Soal4{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println(" masukan bilangan bulat positif");
    int x = input.nextInt();

    System.out.println(" faktorisasi " + x + ":");
    faktorisasi(x);
     input.close();
    }

private static void faktorisasi(int x) {
    for ( int i = 2; i <= x; i++ ){
        while ( x % i == 0){
            System.out.println(i);
            x /= i;
            if ( x > 1 ){
                System.out.print(" * ");
            }
        }
    }
}
}