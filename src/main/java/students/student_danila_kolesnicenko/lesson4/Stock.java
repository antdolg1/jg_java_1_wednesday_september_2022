package students.student_danila_kolesnicenko.lesson4;

class Stock {

    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String name, int currentPrice){
        this.name = name;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;

    }
    public void updatePrice(int price){
        currentPrice = price;
        if (minPrice > price) minPrice = price;
        else if (maxPrice < price) maxPrice = price;

    }
    public String getPriceInformation(){
      return String.format("Company = \"%s\", Current Price = %d, Min Price = %d, Max Price = %d",
              name, currentPrice, minPrice, maxPrice);

    }






}
