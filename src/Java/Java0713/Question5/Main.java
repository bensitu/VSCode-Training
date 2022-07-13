package Java.Java0713.Question5;

public class Main {
    public static void main(String[] args) {
        Employee taro = new Employee();
        taro.name = "太郎";

        Manager hanako = new Manager();
        hanako.name = "花子";

        taro.operation("太郎");
        hanako.operation("花子");
        hanako.management("花子");
    }
}
