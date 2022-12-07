package teacher.lesson_10.lessoncode;

public class MethodOverload {

    public void printName(){};

    public void printName(String name){
        if (name.isBlank()) {
            printName();
        }
    };

    public void printNumber(int num1){};
    public void printNumber(int num1, int num2){};

    public void printSomething(int a, long b){};
    public void printSomething(long b, int a){};

}
