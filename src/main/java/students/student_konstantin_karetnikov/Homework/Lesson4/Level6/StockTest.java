package students.student_konstantin_karetnikov.Homework.Lesson4.Level6;

 class StockTest {
    public static void main(String[] args) {
        StockTest StockTest = new StockTest();
        StockTest.tenSeventySeven();
        StockTest.nineNineNineGreater();
        StockTest.nineNineNineOneGreater();
        StockTest.nineNineNineTwoThousandGreater();
        StockTest.nineNineNineTwoThousandEightGreater();
        StockTest.nineTwentySevenGreater();
    }

    void tenSeventySeven() {
        Stock Penguins = new Stock("Penguins Grupp OU", 10, 10, 10);

        Penguins.getPriceInfo();
        Penguins.updatePrice(12);
        Penguins.getPriceInfo();
        Penguins.updatePrice(5);
        Penguins.getPriceInfo();
        Penguins.updatePrice(7);
        Penguins.getPriceInfo();
        Penguins.updatePrice(99);
        Penguins.getPriceInfo();
        Penguins.updatePrice(77);
        Penguins.getPriceInfo();
    }

    void nineNineNineGreater() {
        int expectedResult = 999;
        Stock Penguins = new Stock("Penguins Grupp OU", 10, 10, 10);
        Penguins.updatePrice(999);
        int realResult = Penguins.updatePrice(Penguins.maxPrice);
        if (realResult == expectedResult) {
            System.out.println("999 Greater test = OK");
        } else {
            System.out.println("999 Greater test = FAIL");
        }
    }

    void nineNineNineOneGreater() {
        int expectedResult = 999;
        Stock Penguins = new Stock("Penguins Grupp OU", 10, 10, 10);
        Penguins.updatePrice(999);
        Penguins.updatePrice(1);
        int realResult = Penguins.updatePrice(Penguins.maxPrice);
        if (realResult == expectedResult) {
            System.out.println("999 Greater then 1 test = OK");
        } else {
            System.out.println("999 Greater then 1 test = FAIL");
        }
    }

    void nineNineNineTwoThousandGreater() {
        int expectedResult = 1000;
        Stock Penguins = new Stock("Penguins Grupp OU", 10, 10, 10);
        Penguins.updatePrice(999);
        Penguins.updatePrice(2);
        Penguins.updatePrice(1000);
        int realResult = Penguins.updatePrice(Penguins.maxPrice);
        if (realResult == expectedResult) {
            System.out.println("1000 Greater test = OK");
        } else {
            System.out.println("1000 Greater test = FAIL");
        }
    }

    void nineNineNineTwoThousandEightGreater() {
        int expectedResult = 1000;
        Stock Penguins = new Stock("Penguins Grupp OU", 10, 10, 10);
        Penguins.updatePrice(999);
        Penguins.updatePrice(2);
        Penguins.updatePrice(1000);
        Penguins.updatePrice(8);
        int realResult = Penguins.updatePrice(Penguins.maxPrice);
        if (realResult == expectedResult) {
            System.out.println("1000 Greater then 8 test = OK");
        } else {
            System.out.println("1000 Greater then 8 test = FAIL");
        }
    }

    void nineTwentySevenGreater() {
        int expectedResult = 27;
        Stock Penguins = new Stock("Penguins Grupp OU", 10, 10, 10);
        Penguins.updatePrice(9);
        Penguins.updatePrice(27);
        int realResult = Penguins.updatePrice(Penguins.maxPrice);
        if (realResult == expectedResult) {
            System.out.println("27 Greater test = OK");
        } else {
            System.out.println("27 Greater test = FAIL");
        }
    }
}



