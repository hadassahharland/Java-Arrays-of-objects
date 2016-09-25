import javax.swing.*;

/**
 * Created by Dassa on 19/09/2016.
 *
 */
public class BookArray {
    static Book[] books = new Book[10];

    public static void main(String[] args) {
        buildArray();
        displayArray();
    }

    private static void displayArray() {
        for (int x = 0; x < books.length; x++){
            System.out.println(books[x].toString());
        }
    }

    private static void buildArray() {
        char bookType;
        String name;
        for (int x = 0; x < books.length; x++) {
            bookType = getBook();
            name = JOptionPane.showInputDialog("Input Title");
            if (bookType == 'n') {
                books[x] = new NonFiction(name);
            }
            else if (bookType == 'f') {
                books[x] = new Fiction(name);
            }
        }
    }

    public static char getBook() {
        String bookType;
        bookType = JOptionPane.showInputDialog("Enter Book type: [f]iction or [n]on-fiction");
        return bookType.charAt(0);
    }
}