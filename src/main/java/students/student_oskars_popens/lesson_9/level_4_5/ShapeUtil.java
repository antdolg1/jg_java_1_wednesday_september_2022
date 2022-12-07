package students.student_oskars_popens.lesson_9.level_4_5;

import java.util.Random;

class ShapeUtil {
    Random rnd = new Random();

    Circle createRandomCircle() {
        double rndRadius = rnd.nextDouble(100);
        return new Circle(rndRadius);
    }

    Square createRandomSquare() {
        double rndSide = rnd.nextDouble(100);
        return new Square(rndSide);
    }

    Rectangle createRandomRectangle() {
        double sideOne = rnd.nextDouble(100);
        double sideTwo = rnd.nextDouble(100);
        return new Rectangle(sideOne, sideTwo);
    }

    Triangle createRandomTriangle() {
        double sideA = rnd.nextDouble(100);
        double sideB = rnd.nextDouble(100);
        double sideC = rnd.nextDouble(100);
        return new Triangle(sideA, sideB, sideC);
    }

    Shape createRandomShape() {
        int randomNumber = rnd.nextInt(4);

        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes){
        double allShapesArea=0;
        for (int i = 0; i < shapes.length; i++) {
            allShapesArea += shapes[i].calculateArea();
        }
        return allShapesArea;
    }

    double calculatePerimeter(Shape[] shapes){
        double allShapesPerimeter=0;
        for (int i = 0; i < shapes.length; i++) {
            allShapesPerimeter += shapes[i].calculatePerimeter();
        }
        return allShapesPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
