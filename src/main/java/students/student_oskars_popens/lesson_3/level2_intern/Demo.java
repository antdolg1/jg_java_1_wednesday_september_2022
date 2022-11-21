package students.student_oskars_popens.lesson_3.level2_intern;

//Task_10
class Demo {
    public static void main(String[] args) {
        String s1 = "Hello Java!";
        System.out.println(s1);
        System.out.println("====================================");

        String s2 = new String("Hello Java!!!");
        System.out.println(s2);
        System.out.println("====================================");

        String str1 = "Hello";
        String str2 = "Java";
        String strOut = str1.concat(str2);
        System.out.println(strOut);
        System.out.println("====================================");

        String strOut1 = str1+str2;
        String strOut2 = "Java"+11;

        System.out.println(strOut1);
        System.out.println(strOut2);
        System.out.println("====================================");

        System.out.println("String Comparison");
        String strc = "Hell";
        String strc1 = "Hello";
        String strc2 = "Hello";
        boolean b = strc1.equals(strc2);
        System.out.println(b);
        b = strc.equals(strc1);
        System.out.println(b);
        System.out.println("====================================");

        System.out.println("String Comparison using == operator");

        String ss1 = "Java";
        String ss2 = "Java";
        String ss3 = new String("Java");
        boolean bb = (ss1==ss2);
        System.out.println(bb);
        b = (ss1==ss3);
        System.out.println(b);


    }
}
