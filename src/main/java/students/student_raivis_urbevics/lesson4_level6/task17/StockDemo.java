package students.student_raivis_urbevics.lesson4_level6.task17;

        class StockDemo {
            public static void main(String[] args) {
                Stock nike = new Stock("Nike", 100, 200, 50);
                nike.getPriceInformation();
                nike.updatePrice(200);
                nike.updatePrice(300);
                nike.updatePrice(40);
                nike.getPriceInformation();
            }
        }



















