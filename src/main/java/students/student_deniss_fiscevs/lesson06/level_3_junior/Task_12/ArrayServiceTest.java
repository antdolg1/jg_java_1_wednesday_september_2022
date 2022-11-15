package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_12;

class ArrayServiceTest {

    public static void main(String[] args){

        ArrayServiceTest test = new ArrayServiceTest();
        test.thereIsSearchingNumber();
        test.thereIsNoSearchingNumber();
    }

    void thereIsSearchingNumber() {

        ArrayService victim = new ArrayService();

        int numberToSearch = 3;
        int[] arr = {1, 2, 3, 3};
        boolean expectedResult = true;
        boolean actualResult = victim.contains(arr, numberToSearch);
        if (expectedResult == actualResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    void thereIsNoSearchingNumber() {

        ArrayService victim = new ArrayService();

        int numberToSearch = 5;
        int[] arr = {1, 2, 3, 3};
        boolean expectedResult = false;
        boolean actualResult = victim.contains(arr, numberToSearch);
        if (expectedResult == actualResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

}
