package students.student_konstantin_karetnikov.lesson_3.level_7;


class PlaneDemo {

    public static void main(String[] args) {
     Plane Plane = new Plane();
        Plane.model = "Boeing 737-800";
        Plane.age = 5;
        Plane.company = "American Airlines";

        Plane.route();
        Plane.aging();
        Plane.changeCompany("AirBaltic");
        System.out.println("Current aircraft age is " + Plane.age + " years old.");
        Plane.route2();
    }

}
