package students.student_sergejs_kozinecs.lesson_3.level_7.Task_31;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.regularPrice = price;
    }

    void setDicount(double discount) {
        this.discount = discount;
    }

    double actualPrice() {
        return regularPrice - (regularPrice * discount);
    }

    void printInformation() {
        System.out.println("Product name: " + name + "\nProduct price: " + regularPrice + "\nDiscount: " + discount
                + "\nActual price: " + actualPrice());
    }

}
