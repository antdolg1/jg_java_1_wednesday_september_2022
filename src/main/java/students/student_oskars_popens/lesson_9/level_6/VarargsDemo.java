package students.student_oskars_popens.lesson_9.level_6;

class VarargsDemo {
    static void demo(String ... text){
        System.out.println("Number of arguments: " + text.length);
        for (String str:text) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        demo("Hello");
        demo("Hi","My","Name","Is");
    }
}
