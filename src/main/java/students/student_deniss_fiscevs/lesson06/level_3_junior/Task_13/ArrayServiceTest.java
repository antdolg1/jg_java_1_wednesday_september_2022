package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_13;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.isNumberOccurred();
        test.doesNotNumberOccurred();
    }

    void isNumberOccurred() {

        ArrayService victim = new ArrayService();
        int numberToSearch = 3;
        int[] arr = {1, 2, 3, 3};
        int expectedResult = 2;
        int actualResult = victim.countOccurrences(arr, numberToSearch);
        if (actualResult == expectedResult) {
            System.out.println("Number occurred = OK");
        } else {
            System.out.println("Number occurred = FAIL");
        }
    }

    void doesNotNumberOccurred() {
        ArrayService victim = new ArrayService();
        int numberToSearch = 4;
        int[] arr = {1, 2, 3, 3,};
        int expectedResult = 0;
        int actualResult = victim.countOccurrences(arr, numberToSearch);
        if (actualResult == expectedResult) {
            System.out.println("Number doesn't occurred = OK");
        } else {
            System.out.println("Number doesn't occurred = FAIL");
        }
    }

}