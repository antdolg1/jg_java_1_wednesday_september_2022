package studentds.student_stivens_veveris.lesson3.level7;

import teacher.lesson_3.lessoncode.Dog;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public Product() {
    }

    public Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public void printInformation(){System.out.println(name + " price with discount is:");}

    public double actualPrice(Product myProduct) {
        double price = myProduct.regularPrice;
        price = price - discount;
        return price;
    }

}