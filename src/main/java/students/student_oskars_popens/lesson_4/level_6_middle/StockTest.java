package students.student_oskars_popens.lesson_4.level_6_middle;

class StockTest {

    void stockTest(){
        Stock company1 = new Stock("GOOG", 999);
        double exceptedCurrentValue, exceptedMax, exceptedMin;

        // Test1 max & min & current

        exceptedMax = 999;
        if (company1.maxValue == exceptedMax){
            System.out.println("Test1 Max value = Ok");
        } else {
            System.out.println("Test1 Max value = FAIL");
        }

        company1.updatePrice(1);
        exceptedMax = 999;
        if (company1.maxValue == exceptedMax){
            System.out.println("Test2 Max value = Ok");
        } else {
            System.out.println("Test2 Max value = FAIL");
        }

        company1.updatePrice(2);
        company1.updatePrice(1000);
        exceptedMax = 1000;
        if (company1.maxValue == exceptedMax){
            System.out.println("Test3 Max value = Ok");
        } else {
            System.out.println("Test3 Max value = FAIL");
        }
        company1.updatePrice(8);
        exceptedMax = 1000;
        if (company1.maxValue == exceptedMax){
            System.out.println("Test4 Max value = Ok");
        } else {
            System.out.println("Test4 Max value = FAIL");
        }

        Stock company2 = new Stock("YAHOO", 9);
        exceptedMax = 9;
        if (company2.maxValue == exceptedMax){
            System.out.println("Test5 Max value = Ok");
        } else {
            System.out.println("Test5 Max value = FAIL");
        }

        company2.updatePrice(27);
        exceptedMax = 27;
        if (company2.maxValue == exceptedMax){
            System.out.println("Test6 Max value = Ok");
        } else {
            System.out.println("Test6 Max value = FAIL");
        }

    }

    public static void main(String[] args) {
        StockTest stock = new StockTest();
        stock.stockTest();
    }
}
