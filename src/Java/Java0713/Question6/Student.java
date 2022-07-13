package Java.Java0713.Question6;

public class Student {
    String name;
    int koku;
    int su;
    int ei;

    public Student(String name, int koku, int su, int ei) {
        this.name = name;
        this.koku = koku;
        this.su = su;
        this.ei = ei;
    }

    public Student(String name) {
        this.name = name;
        this.koku = 0;
        this.su = 0;
        this.ei = 0;
    }

    public void show() {
        System.out.println(this.name + ": " + this.koku + ", " + this.su + ", " + this.ei);
    }
}
