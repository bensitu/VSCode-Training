package Java.Java0715.Question6;

public class Menber {
    String name;
    int monthlyFee;

    protected Menber(String name){
        this.name = name;
        this.monthlyFee = 8000;
    }

    protected Menber(){
        this.monthlyFee = 8000;
    }

    protected String getName(){
        return this.name;
    }

    protected int getMonthlyFee(){
        return this.monthlyFee;
    }

    protected boolean isUseable(int time){
        return true;
    }
}
