package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_29;


import java.util.Scanner;

class TreeDemo {
    public static void main(String[] args) {
        Tree berjozka = new Tree(100, "green", 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tree age: ");
        berjozka.treeAge = scanner.nextInt();
        berjozka.treeGrowth();
        System.out.println("Tree height after " + berjozka.treeAge + " years is: " + berjozka.treeHeight + " meters.");

    }
}
