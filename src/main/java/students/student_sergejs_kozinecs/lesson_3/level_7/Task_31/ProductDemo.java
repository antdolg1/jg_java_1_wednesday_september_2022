package students.student_sergejs_kozinecs.lesson_3.level_7.Task_31;

class ProductDemo {

    public static void main(String[] args) {
        Product milk = new Product("milk");
        Product coffee = new Product("Coffee");

        milk.setPrice(100);
        milk.setDicount(0.1);

        milk.printInformation();
        coffee.printInformation();
    }

}
