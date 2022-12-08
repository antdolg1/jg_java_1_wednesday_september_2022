package students.student_konstantin_karetnikov.lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {
        Product.regularPrice = 999.99;
        Product.discount = 20;
        Product Product = new Product("iPhone 14 Pro Max");
        Product.actualPrice();
        Product.printInformation();

    }
}
