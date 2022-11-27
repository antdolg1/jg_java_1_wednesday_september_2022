package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_29;


class Tree {
    int treeAge;
    String treeColor;
    double treeHeight;

    Tree(int treeAge, String treeColor, int treeHeight) {
        this.treeAge = treeAge;
        this.treeColor = treeColor;
        this.treeHeight = treeHeight;
    }

    void treeGrowth() {
        double treeGrowthPerYear = 1.3;
        treeHeight = treeGrowthPerYear * treeAge;
    }
}
