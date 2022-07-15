package Java.Java0715.Question3;

public class VolumnCoupon extends Coupon {
    int volumn;

    protected VolumnCoupon(int volumn) {
        this.volumn = volumn;
    }

    @Override
    int discount(int mount) {

        return (int) (mount - volumn);
    }

}
