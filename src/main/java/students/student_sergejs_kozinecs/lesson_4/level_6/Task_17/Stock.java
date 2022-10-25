package students.student_sergejs_kozinecs.lesson_4.level_6.Task_17;

class Stock {
    String companyName;
    int price;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int price) {
        this.companyName = companyName;
        this.price = price;
        this.minPrice = price;
        this.maxPrice = price;
    }

    void updatePrice(int price) {
        this.price = price;

        if (this.price > this.maxPrice) {
            this.maxPrice = this.price;
        }

        if (this.price < this.minPrice) {
            this.minPrice = this.price;
        }
    }

    String getPriceInformation() {
        return "Company = \"" + companyName + "\", Current Price = " + price + ", Min Price = " + minPrice
                + ", Max Price = " + maxPrice;
    }

}
