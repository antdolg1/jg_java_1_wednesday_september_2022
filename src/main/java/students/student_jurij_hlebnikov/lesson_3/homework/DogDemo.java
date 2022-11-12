package students.student_jurij_hlebnikov.lesson_3.homework;

class DogDemo {
    public static void main(String[] args) {

        Dog sobaka = new Dog("Alfa ", 3, "Red");
        sobaka.dogVoice();
        sobaka.happyBirthday();
        sobaka.dogVoice();
        sobaka.changeColor("Black");
        sobaka.dogVoice();
    }
}
