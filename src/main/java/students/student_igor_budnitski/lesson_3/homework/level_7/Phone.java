package students.student_igor_budnitski.lesson_3.homework.level_7;

class Phone {
    int number;
    String model;
    String color;

    public Phone(int number, String model, String color) {
        this.number = number;
        this.model = model;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void Ring() {
        System.out.println("Ring!Ring!");
    }

    public void AnswerPhone() {
        System.out.println("This time I am unavailable please leave a message after the \"Beep\" soudnd!");
    }

}
