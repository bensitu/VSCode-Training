package Java.Java0721.Question2;

public class Main {
    public static void main(String[] args) {
        Student[] stu = new Student[20];

        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student(); //
            stu[i].setState((int) (Math.random() * 3 + 1)); // 学生年級
            stu[i].setScore((int) (Math.random() * 100)); // 学生成績
            stu[i].setSex((String) ((int) (Math.random() * 10) % 2 == 0 ? "Male" : "Female")); // 学生性別
            stu[i].setNumber(i + 1); // 学生番号

            // グレードは年齢に基づいて決定されます
            if (stu[i].getState() == 1) {
                stu[i].setAge(13);
            } else if (stu[i].getState() == 2) {
                stu[i].setAge(14);
            } else {
                stu[i].setAge(15);
            }
        }

        // 1. 三年生の学生資料を出力する
        System.out.println("3年目の学生は: ");
        System.out.println("番号    性別    年級    年齢    成績");
        for (Student stuObj : stu) {
            if (stuObj.getState() == 3) {
                System.out.println(((stuObj.getNumber() < 10 ? (stuObj.getNumber() + " ") : (stuObj.getNumber())))
                        + "    "
                        + (stuObj.getSex().equals("Male") ? (stuObj.getSex() + "  ") : stuObj.getSex()) + "       "
                        + stuObj.getState() + "   "
                        + stuObj.getAge() + "     " + stuObj.getScore());
            }
        }

        // 2. 成績の順番で学生を出力する
        Student[] stu2 = new Student[stu.length];
        for (int i = 0; i < stu.length; i++) {
            stu2[i] = stu[i];
        }
        for (int x = 0; x < stu2.length; x++) {
            for (int y = 0; y < stu2.length - 1; y++) {
                int tempScore = 0;
                int tempNumber;
                String tmpSex;
                int tempState;
                int tempAge;
                if (stu2[y].getScore() < stu2[y + 1].getScore()) {
                    tempScore = stu2[y].getScore();
                    stu2[y].setScore(stu2[y + 1].getScore());
                    stu2[y + 1].setScore(tempScore);

                    tempNumber = stu2[y].getNumber();
                    stu2[y].setNumber(stu2[y + 1].getNumber());
                    stu2[y + 1].setNumber(tempNumber);

                    tmpSex = stu2[y].getSex();
                    stu2[y].setSex(stu2[y + 1].getSex());
                    stu2[y + 1].setSex(tmpSex);

                    tempState = stu2[y].getState();
                    stu2[y].setState(stu2[y + 1].getState());
                    stu2[y + 1].setState(tempState);

                    tempAge = stu2[y].getAge();
                    stu2[y].setAge(stu2[y + 1].getAge());
                    stu2[y + 1].setAge(tempAge);
                }
            }
        }

        System.out.println("-------------------------------");
        System.out.println("成績の順番で学生は");
        System.out.println("番号    性別    年級    年齢    成績");
        for (Student stuObj : stu2) {
            System.out.println(((stuObj.getNumber() < 10 ? (stuObj.getNumber() + " ") : (stuObj.getNumber()))) + "    "
                    + (stuObj.getSex().equals("Male") ? (stuObj.getSex() + "  ") : stuObj.getSex()) + "      "
                    + stuObj.getState() + "      "
                    + stuObj.getAge() + "     " + stuObj.getScore());
        }

        // 3. 性別に分けて学生資料を出力する。
        Student[] stu3 = new Student[stu.length];
        for (int i = 0; i < stu.length; i++) {
            stu3[i] = stu[i];
        }
        System.out.println("-------------------------------");
        System.out.println("性別に分けて学生資料は");
        System.out.println("番号    性別    年級    年齢    成績");
        for (Student stuObj2 : stu3) {
            // 男性
            if (stuObj2.getSex().equals("Male")) {
                System.out.println(((stuObj2.getNumber() < 10 ? (stuObj2.getNumber() + " ") : (stuObj2.getNumber())))
                        + " "
                        + (stuObj2.getSex().equals("Male") ? (stuObj2.getSex() + " ") : stuObj2.getSex()) + " "
                        + stuObj2.getState() + " "
                        + stuObj2.getAge() + " " + stuObj2.getScore());
            }
            // 女性
            if (stuObj2.getSex().equals("Female")) {
                System.out.println(((stuObj2.getNumber() < 10 ? (stuObj2.getNumber() + " ") : (stuObj2.getNumber())))
                        + " "
                        + (stuObj2.getSex().equals("Male") ? (stuObj2.getSex() + " ") : stuObj2.getSex()) + " "
                        + stuObj2.getState() + " "
                        + stuObj2.getAge() + " " + stuObj2.getScore());
            }
        }
    }
}
