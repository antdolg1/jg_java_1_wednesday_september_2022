package students.student_jurij_hlebnikov.lesson_3.homework;

class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("Potato");
        product.setRegularPrice(157);
        product.setDiscount(8);
        product.printInformation();
        product.actualPrice();
    }
}
