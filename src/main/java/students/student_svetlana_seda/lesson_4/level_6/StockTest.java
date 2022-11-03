package students.student_svetlana_seda.lesson_4.level_6;

class StockTest {
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
// последнее задание этого урока, признаюсь не допоняла, скопировала -  потом буду разбираться...
    //при его проверки - открывается class Calculator - выдает там ошибки, я их не понимаю - поэтому здесь ничего не могу проверить сейчас :(
}





