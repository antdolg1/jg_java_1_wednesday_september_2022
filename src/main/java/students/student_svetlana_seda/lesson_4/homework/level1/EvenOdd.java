package students.student_svetlana_seda.lesson_4.homework.level1;

class EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the whole number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

    }

}
