package students.student_konstantin_karetnikov.Homework.Lesson4.Level6;

 class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String companyName, int currentPrice, int maxPrice, int minPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }

    int updatePrice(int newPrice) {
        if (newPrice < minPrice) {
            minPrice = newPrice;
            currentPrice = newPrice;
            return minPrice;

        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
            currentPrice = newPrice;
            return maxPrice;
        } else {
            return currentPrice = newPrice;
        }
    }

    String getPriceInfo() {
        System.out.println("Company name: " + companyName + ",  Current price: " + currentPrice + ",  Minimum price: " + minPrice + ",  Maximum price: " + maxPrice);
        return null;
    }
}
