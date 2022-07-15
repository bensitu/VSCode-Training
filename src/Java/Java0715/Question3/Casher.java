package Java.Java0715.Question3;

public abstract class Casher {
    public static int payment(int mount, Coupon coupon) {
        return coupon.discount(mount);
    }
}
