package students.student_igor_budnitski.lesson_3.homework.level_4.Task_14;

import students.student_deniss_fiscevs.lesson03.level_4_junior.Book;

class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
