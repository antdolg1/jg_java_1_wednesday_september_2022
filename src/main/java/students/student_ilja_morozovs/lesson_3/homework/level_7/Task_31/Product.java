package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_31;

import java.util.Scanner;

class Product {
    String name;
    double regularPrice;
    double discount;
    double actualPrice;


    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        actualPrice = regularPrice - ((regularPrice * discount) / 100);
        return actualPrice;
    }

    void addRegularPrice() {
        System.out.println("Please add regular price: ");
        Scanner scanner = new Scanner(System.in);
        regularPrice = scanner.nextDouble();
    }

    void addDiscount() {
        System.out.println("Please add discount: ");
        Scanner scanner = new Scanner(System.in);
        discount = scanner.nextDouble();
    }

    void printInformation() {
        System.out.println("Product name: " + name);
        System.out.println("Product regular price is: " + regularPrice);
        System.out.println("Product actual price is: " + actualPrice);
    }
}
