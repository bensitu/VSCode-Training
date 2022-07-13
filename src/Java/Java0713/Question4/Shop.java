package Java.Java0713.Question4;

public class Shop {
    String name;
    int sales;

    public Shop(String string, int i) {
        name = string;
        sales = i;
    }

    public Shop() {

    }


    public void display() {
        if (name != null) {      
            System.out.println(this.name + ": 売上高" + this.sales);
        } else {
            System.out.println("出店予定: 売上高" + this.sales);
        }
    }
}
