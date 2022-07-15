package Java.Java0715.Question6;

public class SeniorMenber extends Menber {

    protected SeniorMenber() {
        super();
        this.name = "シニア会員";
        this.monthlyFee = (int) (super.getMonthlyFee() * 0.7);
    }

}
