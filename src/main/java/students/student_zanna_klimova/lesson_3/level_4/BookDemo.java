package students.student_zanna_klimova.lesson_3.level_4;

 class BookDemo {
     static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
