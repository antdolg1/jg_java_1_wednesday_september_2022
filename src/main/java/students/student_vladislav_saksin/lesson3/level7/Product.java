package students.student_vladislav_saksin.lesson3.level7;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;

    }

    void regPrice() {

        System.out.println("Regular " + name + " price is " + regularPrice + " Eur");
    }

    void actualPrice() {

        System.out.println("Discount is " + discount + " %");
        System.out.println("Actual " + name + " price is " + ((regularPrice - (regularPrice * discount) / 100)) + " Eur");
    }


}
