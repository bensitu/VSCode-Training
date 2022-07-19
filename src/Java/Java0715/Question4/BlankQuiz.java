package Java.Java0715.Question4;

public class BlankQuiz extends Quiz {
    int blankCount;

    protected BlankQuiz(String main, int blankCount) {
        super(main);
        this.blankCount = blankCount;
    }

    protected void displayHeader() {
        System.out.println("次の空欄を埋めなさい。");
    }

    protected void displayMain() {
        System.out.println(this.main);
        System.out.println(this.main);
        for (int i = 0; i < blankCount; i++) {
            System.out.println((i + 1) + ": ____");
        }
    }
}
