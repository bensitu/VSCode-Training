package Java.Java0715.Question7;

public class Cooler {
    int nowTemp;
    int goalTemp;

    protected Cooler(int nowTemp) {
        this.nowTemp = nowTemp;
    }

    protected void setGoalTemp(int goalTemp) {
        this.goalTemp = goalTemp;
    }

    protected void adjust() {
        if (this.nowTemp <= this.goalTemp) {
            System.out.println("適温です。");
        } else if (this.nowTemp > this.goalTemp) {
            System.out.println("室温が１度下げました。");
            nowTemp--;
        }
    }
}
