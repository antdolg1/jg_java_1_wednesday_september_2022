package students.student_deniss_fiscevs.lesson04.level_6_middle;

class StockTest {

    public static void main(String[] args) {

        StockTest test = new StockTest();
        test.shouldCurrentChange();

    }

    void shouldCurrentChange() {

        Stock victim = new Stock("Mic-o-stock", 100, 10, 150);
        int realUpdatePrice = victim.updatePrice(victim.maxValue);

        if (realUpdatePrice >= victim.maxValue) {
            System.out.println("Updated price MAX test is OK");
        } else {
            System.out.println("Updated price MAX test is FAIL");
        }
        if (realUpdatePrice > victim.minValue) {
            System.out.println("Updated price MIN test is OK");
        } else {
            System.out.println("Updated price MIN test is FAIL");
        }
        if (realUpdatePrice == victim.currentValue) {
            System.out.println("Updated price CURRENT test is OK");
        } else {
            System.out.println("Updated price CURRENT test is FAIL");
        }
    }

}
