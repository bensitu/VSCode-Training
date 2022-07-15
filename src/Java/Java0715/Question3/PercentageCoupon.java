package Java.Java0715.Question3;

public class PercentageCoupon extends Coupon {
    double rate;

    public PercentageCoupon(double rate) {
        this.rate = rate;
    }

    @Override
    int discount(int mount) {

        return (int) (mount * rate);
    }

}
