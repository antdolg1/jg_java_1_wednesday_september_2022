package students.student_oskars_popens.lesson_3.level_7_senior;

class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product("Milk");

        myProduct.setRegularPrice(1.99);
        myProduct.setDiscount(11.5);

        myProduct.printInformation();
    }
}
