package students.student_deniss_fiscevs.lesson04.level_6_middle;

class Stock {

    String name;
    int currentValue;
    int minValue;
    int maxValue;


    Stock(String name, int currentValue, int minValue, int maxValue) {
        this.name = name;
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int updatePrice(int updatedPrice) {
        if (updatedPrice > currentValue && updatedPrice > maxValue) {
            maxValue = updatedPrice;
            return maxValue;
        } else if (updatedPrice < currentValue && updatedPrice < minValue) {
            minValue = updatedPrice;
            return minValue;
        } else {
            return currentValue = updatedPrice;
        }
    }

    void priceInformation() {
        System.out.println("Stock name = " + name + ", current price = " + currentValue + ", min price = " + minValue + ", max price = " + maxValue);
    }

}






