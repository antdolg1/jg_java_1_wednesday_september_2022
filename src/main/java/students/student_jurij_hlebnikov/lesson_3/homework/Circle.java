package students.student_jurij_hlebnikov.lesson_3.homework;

class Circle {                 //Task 30

    double radius;
    double pI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Circle Radius Is: " + (radius * 2) * pI);
    }
}
