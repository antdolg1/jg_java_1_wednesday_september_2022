package students.student_sergejs_kozinecs.lesson_3.level_2;

class Task_10 {
    public static void main(String[] args) {
        String s1 = "Hello Java";
        System.out.println(s1);
        String s2 = new String("Hello Java");
        System.out.println(s2);

        String s = "Hello";
        String str = "Java";
        String str1 = s.concat(str);
        System.out.println(str1);

        String str2 = s + str;
        String str3 = "Java" + 11;
        System.out.println(str2 + str3);

        String s3 = "Hell";
        String s4 = "Hello";
        String s5 = "Hello";
        boolean b = s4.equals(s5);
        System.out.println(b);
        b = s3.equals(s4);
        System.out.println(b);

        boolean c = (s3 == s5);
        System.out.println(c);
        c = (s4 == s5);
        System.out.println(c);
    }
}
