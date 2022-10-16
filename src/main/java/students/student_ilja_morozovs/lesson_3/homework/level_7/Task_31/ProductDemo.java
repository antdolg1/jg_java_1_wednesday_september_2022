package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_31;

 class ProductDemo {
     public static void main(String[] args) {
         Product product=new Product("Tv");
         product.addRegularPrice();
         product.addDiscount();
         product.actualPrice=product.actualPrice();
         product.printInformation();
     }
}
