public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private String status; // "available" or "borrowed"

    // Konstruktor zur Initialisierung eines Buchobjekts
    public Book(int id, String title, String author, int year, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    // Getters and Setters
    // Getter-Methoden (zum Auslesen der Felder)
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getStatus() {
        return status;
    }

    // Setter-Methoden (zum Verändern der Felder)

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " | " + title + " | " + author + " | " + year + " | " + status;
    }
}