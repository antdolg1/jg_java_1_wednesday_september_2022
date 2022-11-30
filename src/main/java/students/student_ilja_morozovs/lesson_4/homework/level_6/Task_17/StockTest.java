package students.student_ilja_morozovs.lesson_4.homework.level_6.Task_17;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();
    }

    void updatePriceTest() {
        int setPrice = 150;
        int maxPriceResult = 150;
        int minPriceResult = 10;
        int currentPrice = 20;
        Stock stock = new Stock("Apple", 20, 150, 10);
        int realPriceResult = stock.updatePrice(setPrice);
        if (realPriceResult >= maxPriceResult) {
            System.out.println("updatePrice Max.Price: TEST OK");
        } else {
            System.out.println("updatePrice Max.Price: TEST FAIL");
        }
        if (realPriceResult < minPriceResult) {
            System.out.println("updatePrice Min.Price: TEST OK");
        } else {
            System.out.println("updatePrice Min.Price: TEST FAIL");
        }
        if (realPriceResult == currentPrice) {
            System.out.println("updatePrice Current.Price: TEST OK");
        } else {
            System.out.println("updatePrice Current.Price: TEST FAIL");
        }
    }
}
