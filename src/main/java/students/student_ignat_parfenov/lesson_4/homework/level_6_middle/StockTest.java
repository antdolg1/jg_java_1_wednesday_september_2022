package students.student_ignat_parfenov.lesson_4.homework.level_6_middle;

public class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();
    }

    void updatePriceTest() {
        int setPrice = 10;
        int maxPriceResult = 250;
        int minPriceResult = 20;
        int currentPrice = 50;
        Stock stock = new Stock("Eni", 20, 150, 10);
        int realPriceResult = stock.updatePrice(setPrice);
        if (realPriceResult >= maxPriceResult) {
            System.out.println("updatePrice Maximum Price: TEST is OK");
        } else {
            System.out.println("updatePrice Maximum Price: TEST is FAILED");
        }
        if (realPriceResult < minPriceResult) {
            System.out.println("updatePrice Minimum Price: TEST is OK");
        } else {
            System.out.println("updatePrice Minimum Price: TEST is FAILED");
        }
        if (realPriceResult == currentPrice) {
            System.out.println("updatePrice Current Price: TEST is OK");
        } else {
            System.out.println("updatePrice Current Price: TEST is FAILED");
        }
    }
}


