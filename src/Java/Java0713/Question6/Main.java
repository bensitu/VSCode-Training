package Java.Java0713.Question6;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("太郎", 80, 75, 90);
        students[1] = new Student("花子", 90, 70, 80);
        students[2] = new Student("次郎");

        System.out.println("成績表");
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
    }
}
