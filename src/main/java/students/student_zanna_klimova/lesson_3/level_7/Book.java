package students.student_zanna_klimova.lesson_3.level_7;

public class Book {
    String title;
    String author;
    boolean isBooked;
    int pages;

    Book(String title, String author, boolean isBooked, int pages){
        this.title = title;
        this.author = author;
        this.isBooked = isBooked;
        this.pages = pages;
    }

    void bookIsBooked() {
        System.out.println("Book is booked.");
    }
}
