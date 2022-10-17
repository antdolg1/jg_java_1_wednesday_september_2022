package students.student_oskars_popens.lesson_3.level_7_senior;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }

    double discountSum() {
        double sum = this.regularPrice * this.discount / 100;
        return Math.round(sum*100.0)/100.0;
    }

    double actualPrice() {
        return this.regularPrice - this.discountSum();
    }

    void printInformation() {
        System.out.println("Product: " + this.name);
        System.out.printf("Product price: %.2f EUR\n", this.regularPrice);
        System.out.printf("Product discount: %.2f%% (%.2f EUR)\n", this.discount, this.discountSum());
        System.out.printf("Product actual price: %.2f EUR", this.actualPrice());
    }


}
