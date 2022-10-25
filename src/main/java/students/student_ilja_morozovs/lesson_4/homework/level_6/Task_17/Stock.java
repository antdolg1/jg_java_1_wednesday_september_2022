package students.student_ilja_morozovs.lesson_4.homework.level_6.Task_17;

class Stock {
    String companyName;
    int currentPrice;
    int maxPrice;
    int minPrice;

    Stock(String companyName, int currentPrice, int maxPrice, int minPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }

    int updatePrice(int setPrice) {
        if (setPrice > currentPrice && setPrice > maxPrice) {
            maxPrice = setPrice;
            return maxPrice;
        } else if (setPrice < currentPrice && setPrice < minPrice) {
            minPrice = setPrice;
            return minPrice;
        } else {
            return currentPrice = setPrice;
        }
    }

    void getPriceInformation() {
        System.out.println(companyName + " " + "current price: " + currentPrice + " maximum price: " + maxPrice + " minimum price: " + minPrice);
    }
}
