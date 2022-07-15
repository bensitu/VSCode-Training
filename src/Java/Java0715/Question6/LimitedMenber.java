package Java.Java0715.Question6;

public class LimitedMenber extends Menber {
    int startTime;
    int endTime;

    protected LimitedMenber(String name, int startTime, int endTime) {
        super(name);
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.monthlyFee = (int) (super.getMonthlyFee() * 0.6);
        this.isUseable(18);
    }

}
