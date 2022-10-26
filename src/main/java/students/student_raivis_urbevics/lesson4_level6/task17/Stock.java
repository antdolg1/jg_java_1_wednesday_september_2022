package students.student_raivis_urbevics.lesson4_level6.task17;


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

    int updatePrice(int enterPrice) {
        if (enterPrice > currentPrice && enterPrice > maxPrice) {
            maxPrice = enterPrice;
            return maxPrice;
        } else if (enterPrice < currentPrice && enterPrice < minPrice) {
            minPrice = enterPrice;
            return minPrice;
        } else {
           return currentPrice = enterPrice;


        }
    }


    public void getPriceInformation() {
        System.out.println("Company = " + companyName + " Current Price =  " + currentPrice + " Max Price = " + maxPrice + " Min Price = " + minPrice);
    }

}













































