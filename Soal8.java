import java.util.Scanner;
public class Soal8 {
    private String username;
    private String password;
    private boolean isActive;
    public Soal8(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true; // Saat membuat akun baru, secara default dianggap aktif
    }
    public void activateAccount() {
        this.isActive = true;
        System.out.println("Akun " + this.username + password+ " telah diaktifkan.");
    }
    public void deactivateAccount() {
        this.isActive = false;
        System.out.println("Akun " + this.username + " telah dinonaktifkan.");
    }
    public boolean isActive() {
        return isActive;
    }
    public String getUsername() {
        return username;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: rio perdana");
        String inputUsername = scanner.nextLine();

        System.out.print("Masukkan password: rio123");
        String inputPassword = scanner.nextLine();

        Soal8 user1 = new Soal8(inputUsername, inputPassword);

        System.out.println("Status akun " + user1.getUsername() + ": Aktif = " + user1.isActive());

        user1.deactivateAccount();
        
        System.out.println("Status akun " + user1.getUsername() + ": Aktif = " + user1.isActive());
        scanner.close();
    }
}
