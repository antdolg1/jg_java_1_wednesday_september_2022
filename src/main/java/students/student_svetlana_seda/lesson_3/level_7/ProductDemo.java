package students.student_svetlana_seda.lesson_3.level_7;

public class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Computer";
        product.regularPrice = 100;
        product.discount = 10;//10%

        product.actualPrice();

    }

}
