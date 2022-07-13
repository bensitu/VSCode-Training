package Java.Java0713.Question5;

public class Manager extends Employee {
    public Manager() {
        super();
      //management(this.name);
    }

    public void management(String name) {
        System.out.println(this.name + "は管理業務を行います。");
    }

}
