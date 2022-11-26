package students.student_ignat_parfenov.lesson_4.homework.level_6_middle;

public class Stock {
    String companyName;
    int price;
    int minimumPrice;
    int maximumPrice;

    public Stock(String companyName, int price, int minimumPrice, int maximumPrice) {
        this.companyName = companyName;
        this.price = price;
        this.minimumPrice = minimumPrice;
        this.maximumPrice = maximumPrice;
    }

    int updatePrice(int setPrice) {
        if (setPrice > price && setPrice > maximumPrice) {
            maximumPrice = setPrice;
            return maximumPrice;
        } else if (setPrice < price && setPrice < minimumPrice) {
            minimumPrice = setPrice;
            return minimumPrice;
        } else {
            return price = setPrice;
        }
    }

    void getPriceInformation() {
        System.out.println(companyName + " " + "current price is: " + price + " maximum price: " + maximumPrice + " minimum price: " + minimumPrice);
    }
}




