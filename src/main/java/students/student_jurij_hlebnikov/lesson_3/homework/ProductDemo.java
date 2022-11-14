package students.student_jurij_hlebnikov.lesson_3.homework;

class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("Potato", 1000, 15);
        product.printInformation();
        product.actualPrice();
    }
}
