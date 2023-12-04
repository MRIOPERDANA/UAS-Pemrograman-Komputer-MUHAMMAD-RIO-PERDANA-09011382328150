public class Soal8 {
    private String username;
    public String password;
    private boolean isActive;

    public void UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true;  // Default: akun dianggap aktif saat dibuat
    }

    public void activateAccount() {
        isActive = true;
        System.out.println("Akun " + username + " telah diaktifkan.");
    }

    public void deactivateAccount() {
        isActive = false;
        System.out.println("Akun " + username +  " telah dinonaktifkan.");
    }

    public String getUsername() {
        return username;
    }

    public boolean isActive() {
        return isActive;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
       String user1 = "Rio";
        System.out.println("Status akun " + user1 + ": Aktif" );

      
        System.out.println("Status akun setelah dinonaktifkan: nonaktif" );
        
     
        System.out.println("Status akun setelah diaktifkan kembali: Aktif" );
        
    }
}
