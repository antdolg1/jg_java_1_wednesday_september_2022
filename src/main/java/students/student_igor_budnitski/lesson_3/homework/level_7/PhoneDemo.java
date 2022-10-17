package students.student_igor_budnitski.lesson_3.homework.level_7;

class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone(5259488, "iPhone", "Black");
        phone1.Ring();
        System.out.println("Phone number: " + phone1.getNumber() + "\n" +
                "Phone model: " + phone1.getModel() + "\n" +
                "Phone color: " + phone1.getColor());
        phone1.AnswerPhone();
    }
}
