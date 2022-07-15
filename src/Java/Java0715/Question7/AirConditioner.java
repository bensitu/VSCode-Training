package Java.Java0715.Question7;

public class AirConditioner extends Cooler {

    protected AirConditioner(int nowTemp) {
        super(nowTemp);

    }

    @Override
    protected void adjust() {
        if (this.nowTemp < this.goalTemp) {
            System.out.println("室温が１度上げました。");
        } else if (this.nowTemp > this.goalTemp) {
            System.out.println("室温が１度下げました。");
        } else {
            System.out.println("適温です。");
        }
    }

}
