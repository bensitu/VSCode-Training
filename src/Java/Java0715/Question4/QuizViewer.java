package Java.Java0715.Question4;

public class QuizViewer {
    int count;

    void showQuiz(Quiz quiz){
        count++;
        System.out.println("第"+count+"問");
        quiz.displayHeader();
        quiz.displayMain();
        System.out.println("");
    }
}
