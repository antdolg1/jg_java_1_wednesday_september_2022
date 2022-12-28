package students.student_viktors_matjukovskis.lesson7;

public class task_1 {

    public static void main(String[] args) {

        String[] m = ("Если несколько слов в тексте встречаются одинаково максимальное число раз," +
                " то возвращаем, то слово," +
                "которое встречается в тексте первым").split(" ");
        int k[] = new int[]{-1, 0};
        for (int i = 0; i < m.length; i++) {
            if (!m[k[1]].equals(m[i]) || k[0] < 0) {
                int c = 1;
                for (int p = i + 1; p < m.length; p++) {
                    if (m[i].equals(m[p])) {
                        c++;
                    }
                }
                if (k[0] < c) {
                    k[0] = c;
                    k[1] = i;
                }
            }
        }
        System.out.println("Самое повторяющееся слово: " + m[k[1]] + " (встречается " + k[0] + " раз)");

    }

}
