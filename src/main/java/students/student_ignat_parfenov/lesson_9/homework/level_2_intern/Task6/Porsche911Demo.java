package students.student_ignat_parfenov.lesson_9.homework.level_2_intern.Task6;

class Porsche911Demo {

    public static void main(String[] args) {
        // продемонстрируйте создание инстанции класса Porsche911

        Car car = new Car(1975);
        Porsche911 porsche911 = new Porsche911(1975, 250);

        System.out.println(car);
        System.out.println(porsche911);
    }
}
