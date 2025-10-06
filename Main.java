import java.util.Scanner; // Zum Einlesen von Benutzereingaben

public class Main {
    public static void main(String[] args) {
        // Initialisiert die Bibliotheksverwaltung und den Scanner
        LibraryManager manager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Steuert die Hauptschleife

        // Hauptmenü-Schleife
        while (running) {
            // Ausgabe des Menüs
            System.out.println("\n1. Add Book\n2. View Book\n3. Update Book\n4. Delete Book\n5. List Books\n6. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt(); // Liest Benutzerwahl ein
            scanner.nextLine(); // Verbraucht das Restzeichen nach nextInt()

            switch (choice) {
                case 1:
                    // Buch hinzufügen
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Status (available/borrowed): ");
                    String status = scanner.nextLine();

                    manager.addBook(new Book(id, title, author, year, status));
                    break;

                case 2:
                    // Buch anzeigen
                    System.out.print("ID: ");
                    int viewId = scanner.nextInt();
                    Book viewBook = manager.getBookById(viewId);
                    System.out.println(viewBook != null ? viewBook : "Book not found.");
                    break;

                case 3:
                    // Buch aktualisieren
                    System.out.print("ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    Book updateBook = manager.getBookById(updateId);
                    if (updateBook != null) {
                        System.out.print("New Title: ");
                        updateBook.setTitle(scanner.nextLine());

                        System.out.print("New Author: ");
                        updateBook.setAuthor(scanner.nextLine());

                        System.out.print("New Year: ");
                        updateBook.setYear(scanner.nextInt());
                        scanner.nextLine();

                        System.out.print("New Status: ");
                        updateBook.setStatus(scanner.nextLine());

                        manager.updateBook(updateBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    // Buch löschen
                    System.out.print("ID: ");
                    int deleteId = scanner.nextInt();
                    manager.deleteBook(deleteId);
                    break;

                case 5:
                    // Alle Bücher anzeigen
                    for (Book b : manager.listBooks()) {
                        System.out.println(b);
                    }
                    break;

                case 6:
                    // Programm beenden
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close(); // Scanner schließen
    }
}