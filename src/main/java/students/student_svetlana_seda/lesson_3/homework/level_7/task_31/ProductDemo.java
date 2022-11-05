package students.student_svetlana_seda.lesson_3.homework.level_7.task_31;

class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Computer";
        product.regularPrice = 100;
        product.discount = 10;//10%

        product.actualPrice();

    }

}
