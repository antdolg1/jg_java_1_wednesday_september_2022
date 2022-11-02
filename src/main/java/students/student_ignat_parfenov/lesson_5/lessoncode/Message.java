package students.student_ignat_parfenov.lesson_5.lessoncode;

public class Message {

    public static int instancesCreated = 0;

    private String text;

    public Message(String text) {
        this.text = text;

        System.out.println("Creating message = '" + text + "'");
    }
}
