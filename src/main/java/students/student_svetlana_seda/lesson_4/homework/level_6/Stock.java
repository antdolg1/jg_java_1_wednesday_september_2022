package students.student_svetlana_seda.lesson_4.homework.level_6;

import java.sql.SQLOutput;

class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock (String companyName, int currentPrice, int maxPrice, int minPrice) {

        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;

    }

// Обновить текущую стоимость акции updatePrice()

    int updatePrice( int price) {

        if (price > currentPrice && price > maxPrice) {
            maxPrice = price;
            return maxPrice;
        } else if (price < currentPrice && price < minPrice) {
            minPrice = price;
            return minPrice;
        } else {
            return currentPrice = price;
        }

    }

    //2
    void getPriceInformation() {

        System.out.println("Company name is " + companyName + ", current price is " + currentPrice + ", maximum price is " + maxPrice + ", minimum price is " + minPrice);

    }

}
