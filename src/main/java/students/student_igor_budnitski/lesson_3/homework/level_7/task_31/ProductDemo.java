package students.student_igor_budnitski.lesson_3.homework.level_7.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Hat");
        product1.setRegularPrice(25.3);
        product1.setDiscount(5.3);

        System.out.println("Product price with discount: " + product1.actualPrice());

        product1.printInformation();
    }
}
