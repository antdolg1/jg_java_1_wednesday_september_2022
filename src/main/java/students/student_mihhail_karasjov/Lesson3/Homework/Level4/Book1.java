package students.student_mihhail_karasjov.Lesson3.Homework.Level4;

public class Book1 {
    String title;

    Book1(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book1 myBook = new Book1("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
