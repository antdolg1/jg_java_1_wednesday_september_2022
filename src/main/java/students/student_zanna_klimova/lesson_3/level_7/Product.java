package students.student_zanna_klimova.lesson_3.level_7;

 class Product {
    String name;
    double regularPrice;
    double discount;

     Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        double priceAfterDiscount = regularPrice - discount;
        return priceAfterDiscount;
    }

    void printInformation() {
        System.out.println("Product cost is: " + regularPrice);
    }
}
