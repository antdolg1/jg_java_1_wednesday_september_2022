package students.student_stivens_veveris.lesson3.level7;

import studentds.student_stivens_veveris.lesson3.level7.Product;

public class ProductDemo {

    public static void main(String[] args) {


        Product firstProduct = new Product("Jeans", 32.56, 12);
        firstProduct.printInformation();
        System.out.println(firstProduct.actualPrice(firstProduct));

    }
}
