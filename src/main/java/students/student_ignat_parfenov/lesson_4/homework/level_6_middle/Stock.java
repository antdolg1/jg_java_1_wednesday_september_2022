package students.student_ignat_parfenov.lesson_4.homework.level_6_middle;

public class Stock {

    String companyName;
    int currentCost;
    int minimumPrice;
    int maximumPrice;

    public Stock(String companyName, int currentCost, int minimumPrice, int maximumPrice) {
        this.companyName = companyName;
        this.currentCost = currentCost;
        this.minimumPrice = minimumPrice;
        this.maximumPrice = maximumPrice;
    }

    int updatePrice(int newPrice) {

        if (minimumPrice < newPrice) {
            currentCost = newPrice;
            return minimumPrice;

        } else if (newPrice > maximumPrice) {
            maximumPrice = newPrice;
            currentCost = newPrice;
            return maximumPrice;
        } else {
            return currentCost = newPrice;
        }
    }

        String getPriceInformation; {
            System.out.println("Company " + companyName + " stock current price " + currentCost + " , minimum price " + minimumPrice + " , maximum price" + maximumPrice);
        }
    }





