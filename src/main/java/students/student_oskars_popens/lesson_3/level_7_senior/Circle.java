package students.student_oskars_popens.lesson_3.level_7_senior;

class Circle {
    double radius;

    double calculateArea(){
        return Math.PI * (2 * this.radius);
    }

    void printArea(){
        System.out.println("Circle area: " + this.calculateArea());
    }
}
