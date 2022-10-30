package students.student_svetlana_seda.lesson_3.level_7.task_31;

public class Product {
    String name;
    double regularPrice;
    double actualPrice;
    double discount;

    void actualPrice() {
        System.out.println("Computer's price with discount is " + (regularPrice - discount) + " dollars.");
    }

}

