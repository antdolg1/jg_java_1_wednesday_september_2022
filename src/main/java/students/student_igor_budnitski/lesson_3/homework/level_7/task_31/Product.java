package students.student_igor_budnitski.lesson_3.homework.level_7.task_31;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double actualPrice() {
        return regularPrice - discount;
    }

    void printInformation() {
        System.out.println("Product name: " + name + "\n" + "Price: " + regularPrice + "\n" + "Discount: " + discount);
    }
}
