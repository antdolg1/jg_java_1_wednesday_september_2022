package students.student_svetlana_seda.lesson_3.level_7.task_31;

import students.student_svetlana_seda.lesson_3.level_7.task_31.Product;

public class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Computer";
        product.regularPrice = 100;
        product.discount = 10;//10%

        product.actualPrice();

    }

}
