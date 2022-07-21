package Java.Java0721.Question1;

public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
            // 抛出异常
        }

    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score > 0) {
            this.score = score;
        } else {
            this.score = 0;
        }

    }
}
