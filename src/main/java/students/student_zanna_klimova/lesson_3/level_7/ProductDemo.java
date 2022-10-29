package students.student_zanna_klimova.lesson_3.level_7;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Product1", 100, 30);
        product.printInformation();
        System.out.println("Discount is: " + product.discount);
        System.out.println("Price after discount is: " + product.actualPrice());
    }
}
