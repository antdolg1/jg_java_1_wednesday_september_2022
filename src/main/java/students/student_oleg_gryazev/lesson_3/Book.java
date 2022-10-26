package students.student_oleg_gryazev.lesson_3;
class Book {
    String title;
    Book(String title) {
        this.title = new String(title);
    }
    String getTitle() {
        return this.title;
    }
}
class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
class Phone {
    String model;
            Phone(String newModel) {
            this.model = newModel;
           }
        String getModel(){
    return this.model;

        }
    }

    class PhoneDemo {
        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }
    }
class Car {
    String model;
    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}
class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerFirstName;
    }

    int getMoneyAmount() {
        return this.moneyAmount;
    }

}
