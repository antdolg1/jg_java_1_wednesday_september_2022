package teacher.lesson_7.lessoncode;

public class CatDemo {

    public static void main(String[] args) {

        Cat cat = new Cat(3, "Boris");
        cat.setAge(-100);

        System.out.println("Cats age is: " + cat.getAge());

    }

}
