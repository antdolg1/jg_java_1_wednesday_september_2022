package students.student_konstantin_karetnikov.lesson_3.level_7;

class Circle {
    double radius;
    double area = calculateArea();
     
    double calculateArea() {
        area = Math.PI * (radius * radius);
        return area;
     }
}
