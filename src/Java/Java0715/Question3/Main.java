package Java.Java0715.Question3;

public class Main {
    public static void main(String[] args) {
        PercentageCoupon coupon1 = new PercentageCoupon(0.3);
        VolumnCoupon coupon2 = new VolumnCoupon(1000);

        System.out.println(Casher.payment(5000, coupon1));
        System.out.println(Casher.payment(5000, coupon2));

        PercentageCoupon coupon3 = new PercentageCoupon(0.5);
        VolumnCoupon coupon4 = new VolumnCoupon(1500);

        System.out.println(Casher.payment(5000, coupon3));
        System.out.println(Casher.payment(5000, coupon4));
    }
}
