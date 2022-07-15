package Java.Java0715.Question5;

public abstract class Employee0901 {
    String description;

    protected Employee0901(String description) {
        this.description = description;
    }

    abstract void goOffice();

    abstract void work();

    abstract void goHome();
}
