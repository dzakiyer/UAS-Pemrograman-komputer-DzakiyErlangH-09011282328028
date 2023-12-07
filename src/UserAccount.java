public class UserAccount {
    private String username;
    private String password;
    private boolean isActive;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = false;
    }

    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void activate() {
        if (!isActive) {
            isActive = true;
            System.out.println("Akun " + username + " telah diaktifkan");
        } else {
            System.out.println("Akun " + username + " sudah aktif");
        }
    }

    public void deactivate() {
        if (isActive) {
            isActive = false;
            System.out.println("Akun " + username + " telah dinonaktifkan");
        } else {
            System.out.println("Akun " + username + " sudah nonaktif");
        }
    }

    public void displayStatus() {
        System.out.println("Username: " + username);
        System.out.println("Status: " + (isActive ? "Aktif" : "Nonaktif"));
    }
}
