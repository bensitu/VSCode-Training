package Java.Java0715.Question4;

public class Main {
    public static void main(String[] args) {
        Quiz q1 = new Quiz("最も面積の広い都道府県はどこですか？");
        String[] answers = {"青りんご","さくらんぼ","みかん","葡萄"};
        Quiz q2 = new MultipleChoiceQuiz("赤い果物はどれですか？", answers);
        Quiz q3 = new BlankQuiz("（　）は（　）年に鎌倉幕府を設立した。",2);

        QuizViewer.showQuiz(q1);
        QuizViewer.showQuiz(q2);
        QuizViewer.showQuiz(q3);
    }
}
