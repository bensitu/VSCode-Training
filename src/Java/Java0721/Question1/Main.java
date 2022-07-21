package Java.Java0721.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double TotalScore = 0;
        double AverageScore = 0;
        double MinScore = 100;
        double MaxScore = 0;
        Student[] stu = new Student[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the names:");
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student(input.nextLine());
            stu[i].setId(i + 1);
            if (stu[i].getScore() > MaxScore) {
                MaxScore = stu[i].getScore();
            }
            if (stu[i].getScore() < MinScore) {
                MinScore = stu[i].getScore();
            }
            TotalScore += stu[i].getScore();
        }
        AverageScore = TotalScore / stu.length;
        System.out.println("番号 名前 年齢 成績");
        for (Student student : stu) {
            System.out.println(
                    student.getId() + "     " + student.getName() + "    " + student.getAge() + "     "
                            + student.getScore());
        }
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("平均成績は" + AverageScore + "  最高分は" + MaxScore + "  最低分は" + MinScore);
        input.close();
    }
}
