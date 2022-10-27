package students.student_deniss_fiscevs.lesson04.level_6_middle;

public class StockDemo {

    public static void main(String[] args) {

        Stock microsoft = new Stock("Mic-o-stock", 666, 540, 999);
        microsoft.priceInformation();
        microsoft.updatePrice(777);
        microsoft.updatePrice(45);
        microsoft.updatePrice(999);
        microsoft.priceInformation();

    }
}
