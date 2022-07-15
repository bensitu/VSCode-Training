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

    protected int getMonthlyFee() {
        return this.monthlyFee = (int) (super.getMonthlyFee() * 0.6);
    }

    public boolean isUseable(int hour) {
        if (startTime <= endTime) {
            if (startTime <= hour && hour <= endTime) {
                return false;
            }
        } else {
            if ((startTime <= hour && hour <= 23) || (0 <= hour && hour <= endTime)) {
                return true;
            }
        }
        return false;
    }

}
