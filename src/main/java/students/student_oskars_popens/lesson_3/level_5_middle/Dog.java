package students.student_oskars_popens.lesson_3.level_5_middle;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    Dog (String dogName){
        this.dogName = dogName;
    }

    Dog(String dogName, int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    Dog (String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    void voice(){
        System.out.println(this.dogName);
        System.out.println(this.dogName);
        System.out.println(this.dogName);
    }

    void voiceAge(){
        System.out.println("Name: " + this.dogName + " Age: " + this.dogAge);
    }

    void happyBirthday(){
        System.out.println("Happy Bitrthday!!!");
        this.dogAge++;
    }

    void voiceAgeColor(){
        System.out.println("Dog name: " + this.dogName +
                " Dog age:" + this.dogAge +
                " Dog color:" + this.dogColor);
    }

    void changeColor(String newColor){
        this.dogColor = newColor;
    }

}
