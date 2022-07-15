package Java.Java0715.Question4;

public class MultipleChoiceQuiz extends Quiz {
    int blankCount;

    protected MultipleChoiceQuiz(String main, int blankCount){
        super(main);
        this.blankCount = blankCount;
    }

    void displayHeader(){
        System.out.println("次の空欄を埋めなさい。");
    }
}
