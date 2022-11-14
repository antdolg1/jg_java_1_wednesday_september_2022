package students.student_jurij_hlebnikov.lesson_3.homework;

class Product {                  //Task 31

    String name;
    double regularPrice;
    double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        double productDiscount = regularPrice * (discount / 100);
        System.out.print("Price for 1 kg Tomorrow: ");
        System.out.print(regularPrice - productDiscount);
        System.out.println(" kg");
        return productDiscount;
    }

    void printInformation() {
        System.out.println(name + " Today Price: " + regularPrice + " for 1 kg");
        System.out.println("Tomorrow We have Discount " + discount + "%");
    }
}
