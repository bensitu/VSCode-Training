package Java.Java0715.Question4;

public class Quiz {
    String main;

    protected Quiz(String main){
        this.main = main;
    }

    void displayHeader(){
        System.out.println("次の問いに答えなさい。");
    }

    void displayMain(){
        System.out.println(this.main);
    }
}
