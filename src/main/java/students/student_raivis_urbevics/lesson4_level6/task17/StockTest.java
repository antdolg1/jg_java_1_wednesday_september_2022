package students.student_raivis_urbevics.lesson4_level6.task17;



        class StockTest {
        public static void main(String[] args) {
        StockTest stocktest = new StockTest();
        stocktest.updatePriceTest();
    }

    public void updatePriceTest() {
        int enterPrice = 40;
        int currentPrice = 200;
        int maxPriceResult = 400;
        int minPriceResult = 40;
        Stock stock = new Stock("Nike", 200, 300, 40);
        int realPriceResult = stock.updatePrice(enterPrice);
        if (realPriceResult >= maxPriceResult) {
            System.out.println("update Max Price Result Test = OK ");
        } else {
            System.out.println("update Max Price Result Test = FAIL");
        }
        if (realPriceResult <= minPriceResult) {
            System.out.println("update Min Price Result Test = OK ");
        } else {
            System.out.println("update Min Price Result Test = FAIL ");
        }
        if (realPriceResult == currentPrice) {
            System.out.println("update Current Price Result Test = OK ");
        } else {
            System.out.println("update Current Price Result Test = FAIL ");
        }
    }
}
