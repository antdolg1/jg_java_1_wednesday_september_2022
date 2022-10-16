package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_29;

class PhoneBookDemo {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("Ilja", "Morozovs", "911");
        phoneBook.name = phoneBook.setName();
        System.out.println("new name is: "+phoneBook.name);
        phoneBook.surname = phoneBook.setSurname();
        System.out.println("new surname is: "+phoneBook.surname);
        phoneBook.phoneNumber = phoneBook.setNumber();
        System.out.println("new number is: "+phoneBook.phoneNumber);
    }
}
