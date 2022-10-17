package students.student_danila_kolesnicenko.lesson3;

class Apple {

    private boolean isBig = false;
    private int weight = 0;

    private int size = 0;

    public Apple(int weight, int size) {
        this.weight = weight;
        this.size = size;
    }

    public Apple() {
    }

    public void rot() {
        this.weight -= 1;
    }

    public void info() {
        System.out.println("isBig: " + this.isBig + "\nWeight: " + this.weight + "\nSize: " + this.size);
    }

    public void grow(){
        this.size+=1;
        this.weight += 2;
        this.isBig = size>=5;
    }
}
