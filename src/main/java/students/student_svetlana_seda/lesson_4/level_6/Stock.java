package students.student_svetlana_seda.lesson_4.level_6;

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

    //Методы:
//- Обновить текущую стоимость акции updatePrice()
    int updatePrice(int updatePrice) {

        if (updatePrice > currentValue && updatePrice > maxValue) {
            maxValue = updatePrice;
            return maxValue;
        } else if (updatePrice < currentValue && updatePrice < minValue) {
            minValue = updatePrice;
            return minValue;
        } else {
            return currentValue = updatePrice;
        }

    }

    //- Получить информацию об акции getPriceInformation()
    void priceInformation() {
        System.out.println("Stock name = " + name + ", Current price = " + currentValue + ", minimal price = " + minValue + ", maximal price = " + maxValue);
    }

}

