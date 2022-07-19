package Java.Java0715.Question4;

public class MultipleChoiceQuiz extends Quiz {
    String answers[];

    protected MultipleChoiceQuiz(String main, String answers[]) {
        super(main);
        this.answers = answers;
    }

    void displayHeader() {
        System.out.println("次の問いについて、正しいものを４つ中にから選びなさい。");
    }

    void displayMain() {
        System.out.println(this.main);
        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1) + ": " + answers[i]);
        }
    }
}
