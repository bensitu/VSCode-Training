package Java.Java0715.Question1;

public class Armor extends Item {

    public Armor(String name, int value) {
        super(name, value);
    }

    @Override
    void use() {
        System.out.println(name + "を身に付けた");
        System.out.println("守備力が" + value + "上がった");
    }

}
