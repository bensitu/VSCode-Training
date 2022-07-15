package Java.Java0715.Question1;

public abstract class Item {
    String name;
    int value;

    public Item(String name, int value){
        this.name = name;
        this.value = value;
    }

    abstract void use();
}
