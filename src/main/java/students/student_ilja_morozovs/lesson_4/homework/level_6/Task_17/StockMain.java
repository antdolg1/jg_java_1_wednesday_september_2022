package students.student_ilja_morozovs.lesson_4.homework.level_6.Task_17;


public class StockMain {
    public static void main(String[] args) {
        Stock google = new Stock("Google", 100, 190, 60);
        google.getPriceInformation();
        google.updatePrice(5);
        google.updatePrice(300);
        google.updatePrice(50);
        google.getPriceInformation();
    }
}
