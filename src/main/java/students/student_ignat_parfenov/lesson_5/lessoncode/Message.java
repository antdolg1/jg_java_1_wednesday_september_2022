package students.student_ignat_parfenov.lesson_5.lessoncode;

public class Message {

    public static int instancesCreated = 0;

    private String text;

    public Message(String text) {
        this.text = text;

        System.out.println("Creating message = '" + text + "'");
        instancesCreated++;
    }

    public static void main(String[] args) {

        System.out.println("Created " + Message.instancesCreated);
        Message greeting = new Message("Hi!");
        Message question = new Message("How are you?");
        Message answer = new Message("Tnx, I am fine!");
        Message farewell = new Message("Goodbye!");
        System.out.println("Finally created " + Message.instancesCreated);

    }
}
