package Java.Java0822.Question1;

public class MA_game_status {
    private int correct;
    private int wrong;

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public void addCorrect(MA_game_status status) {
        status.setCorrect(status.getCorrect() + 1);
    }

    public void addWrong(MA_game_status status) {
        status.setWrong(status.getWrong() + 1);
    }
}
