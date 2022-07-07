package Java.Java0707;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JP_SCORE;
        int MATH_SCORE;
        int Sum_Score;
        int Average_score;

        System.out.println("Please input your Japanese score: (0-100)");
        JP_SCORE = input.nextInt();
        Check_Score cs1 = new Check_Score();
        cs1.check_number(JP_SCORE);

        System.out.println("Please input your Math score: (0-100)");
        MATH_SCORE = input.nextInt();
        Check_Score cs2 = new Check_Score();
        cs2.check_number(MATH_SCORE);
        input.close();

        Sum_Score = JP_SCORE + MATH_SCORE;
        Average_score = Sum_Score / 2;
        System.out.println("Your average score is " + Average_score + ".");

        if (Average_score > 80) {
            System.out.println("High Score!");
        } else if (Average_score >= 65 && Average_score < 80) {
            System.out.println("It's OK");
        } else if (Average_score >= 35 && Average_score < 65) {
            System.out.println("頑張ってください。");
        } else {
            System.out.println("It's bad!");
        }
    }
}

class Check_Score {
    public void check_number(int num) {
        if (num > 100) {
            System.out.println("The inputed score is over than 100!");
        } else if (num < 0) {
            System.out.println("The inputed score is less than 0!");
        } else {
        }
    }
}
