package students.student_oskars_popens.lesson_9.level_4_5;

class Square extends Shape {

    private double squareSize;

    Square(double size){
        super("Square");
        this.squareSize = size;
    }

    @Override
    double calculateArea() {
        return squareSize * squareSize;
    }

    @Override
    double calculatePerimeter() {
        return squareSize * 4;
    }

    public double getSquareSize() {
        return squareSize;
    }
}
