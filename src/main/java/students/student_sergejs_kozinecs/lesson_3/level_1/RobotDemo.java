package students.student_sergejs_kozinecs.lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.

        Robot robotOne = new Robot();
        robotOne.sayHello();
        robotOne.sayYourName();

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
    }
}
