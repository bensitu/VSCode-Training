package Java.Java0721.Question1;

public class Student {
    private int id;
    private String name;
    private int age;
    private int score;

    public Student(String name) {
        this.name = name;
        this.age = (int) (Math.random() * 60);
        this.score = (int) (Math.random() * 100);
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

    public double getScore() {
        return score;
    }
}
