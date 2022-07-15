package Java.Java0715.Question5;

public class GeneralManager0901 extends Employee0901 {

    protected GeneralManager0901(String description) {
        super(description);
    }

    @Override
    protected void goOffice() {
        System.out.println(this.description);
    }

    @Override
    protected void work() {
        System.out.println("I'm working!"); 
    }

    @Override
    protected void goHome() {
        System.out.println("お疲れ様です。"); 
    }
    
}
