package students.student_ignat_parfenov.lesson2_hw_level_2_intern;

public class Task3 {public static void main(String[] args){

    class Book {
        private int pages;
        private String name;
        private float weight;

        public void getInfoBook () {
            System.out.print("This book " + name + "consists of " + pages + " pages ");
            System.out.print("While it weighs in a " + weight + "pounds!");
            System.out.println("");
        }

        Book (int pages, float weight) {
            this.pages = pages;
            this.weight = weight;
        }

        Book(int pages, float weight, String name) {
            this.pages = pages;
            this.weight = weight;
            this.name = name;
        }

        int getPages = 154;
        float getWeight = 5.75f;
        String getName = "Apocalypse now";

    }
}
}
