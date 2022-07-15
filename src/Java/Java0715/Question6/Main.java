package Java.Java0715.Question6;

public class Main {
    public static void main(String[] args) {
        Menber sei = new Menber("正会員");
        SeniorMenber senior = new SeniorMenber();
        LimitedMenber daytime = new LimitedMenber("デイタイム会員", 10, 20);
        LimitedMenber night = new LimitedMenber("ナイト会員", 20, 9);

        System.out.println("各会員料金");
        System.out.println(sei.getName() + ": " + sei.getMonthlyFee());
        System.out.println(senior.getName() + ": " + senior.getMonthlyFee());
        System.out.println(daytime.getName() + ": " + daytime.getMonthlyFee());
        System.out.println(night.getName() + ": " + night.getMonthlyFee());
        System.out.println("");
        System.out.println("各会員の２２時の利用");
        System.out.println(sei.getName() + ": " + sei.isUseable(22));
        System.out.println(senior.getName() + ": " + senior.isUseable(22));
        System.out.println(daytime.getName() + ": " + daytime.isUseable(22));
        System.out.println(night.getName() + ": " + night.isUseable(22));
    }
}
