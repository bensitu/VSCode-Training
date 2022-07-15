package Java.Java0715.Question7;

public class Main {
    public static void main(String[] args) {
        Cooler cooler = new Cooler(28);
        AirConditioner aircon = new AirConditioner(28);

        cooler.setGoalTemp(27);
        cooler.adjust();

        cooler.adjust();

        aircon.adjust();
        aircon.adjust();

        aircon.setGoalTemp(28);
        aircon.adjust();
        aircon.adjust();
    }
}
