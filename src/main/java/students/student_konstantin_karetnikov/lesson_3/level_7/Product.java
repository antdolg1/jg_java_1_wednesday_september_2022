package students.student_konstantin_karetnikov.lesson_3.level_7;

class Product {
    String name;
    static double regularPrice;
    static double discount;
    double actualPrice;


    Product (String name) {
        this.name = name;
    }

    double actualPrice(){ actualPrice = regularPrice - (regularPrice * discount / 100);
        return actualPrice;
    }
    void printInformation(){

        System.out.println("Product name: " + name + "." + "\n" + "Normal price: " + regularPrice + " euro." + "\n" + "Discount size " + discount + "%." + "\n"  + "Price with discount: " + actualPrice + " euro.");
    }

}
