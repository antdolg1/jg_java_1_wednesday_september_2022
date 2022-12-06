package students.student_danila_kolesnicenko.lesson3;

class Dog {
    private String name;
    int age;

    String color;
    public void voice(){
        System.out.println(name + name + name + age + color);
    }
    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void happyBirthday() {
        this.age += 1;
    }
    void changeColor(String newColor) {
        this.color = newColor;
    }

}




