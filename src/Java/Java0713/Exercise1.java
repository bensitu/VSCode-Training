package Java.Java0713;

public class Exercise1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        p1.addAge(2);

        System.out.println(p1.age);

        p1.playGame();

        
    }
}

class Person {
    String name;
    int age;
    int sex;

    public void study() {
        System.out.println("勉強しています。");
    }

    public void showAge() {
        System.out.println("The age is " + age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }

    public void playGame(){
        System.out.println("Play");
    }
}
