package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_29;

import java.util.Scanner;

class PhoneBook {
    String name;
    String surname;
    String phoneNumber;

    PhoneBook(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    String setName() {
        System.out.println("Add name: ");
        Scanner scanner = new Scanner(System.in);
        return name = scanner.nextLine();
    }

    String setSurname() {
        System.out.println("Add surname: ");
        Scanner scanner = new Scanner(System.in);
        return surname = scanner.nextLine();
    }

    String setNumber() {
        System.out.println("Add number: ");
        Scanner scanner = new Scanner(System.in);
        return phoneNumber = scanner.nextLine();
    }
}
