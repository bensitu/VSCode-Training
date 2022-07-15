package Java.Java0715.Question1;

public class Buki extends Item {

    public Buki(String name, int value) {
        super(name, value);
    }

    @Override
    void use() {
        System.out.println(name + "で攻撃！！");
        System.out.println("敵に" + value + "のダメージ！");

    }

}
