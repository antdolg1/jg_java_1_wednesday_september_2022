package students.student_ilja_morozovs.lesson_8.homework.level_2.Task_8;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest=new FraudDetectorTest();
        fraudDetectorTest.condition(fraudDetectorTest.isFraudTest());
    }

    boolean isFraudTest(){
        Trader trader=new Trader("Pokemon","Riga");
        Transaction transaction=new Transaction(trader,500);
        FraudDetector fraudDetector=new FraudDetector();
        return !fraudDetector.isFraud1(transaction);
    }

    void condition(boolean condition){
        if (condition){
            System.out.println("Test is OK!!!");
        }else {
            System.out.println("Test is FAIL!!!");
        }
    }
}
