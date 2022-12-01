package teacher.lesson_9.lessoncode;

public class ZinadineZidane implements FootballPlayer, Businessman{

    @Override
    public void playFootball() {
        System.out.println("I play for France...not anymore!");
    }

    @Override
    public void doBusiness() {
        System.out.println("I do business in France!");
    }
}
