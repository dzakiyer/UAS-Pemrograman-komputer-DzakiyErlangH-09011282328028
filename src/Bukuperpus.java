public class Bukuperpus {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;

    public Bukuperpus(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Anda berhasil meminjam buku " + title);
        } else {
            System.out.println("Maaf, buku " + title + " sedang dipinjam orang lain");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Anda berhasil mengembalikan buku " + title);
        } else {
            System.out.println("Buku " + title + " tidak sedang dipinjam");
        }
    }

    public void displayInfo() {
        System.out.println("Judul: " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Tahun Terbit: " + year);
        System.out.println("Status: " + (isBorrowed ? "Dipinjam" : "Tersedia"));
    }
}
