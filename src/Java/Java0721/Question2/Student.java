package Java.Java0721.Question2;

public class Student {
    private int number;
    private String sex;
    private int state;
    private int age;
    private int score;

    public Student() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("Male") || sex.equals("Female")) {
            this.sex = sex;
        } else {
            System.out.println("Sex erroe! ");
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (state < 1 || state > 3) {
            System.out.println("State error! " + state);
        } else {
            this.state = state;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 15 || age >= 13) {
            this.age = age;
        } else {
            this.age = 0;
            System.out.println("Age error!");
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score <= 100 || score >= 0) {
            this.score = score;
        } else {
            System.out.println("Score error!");
        }
    }

}
