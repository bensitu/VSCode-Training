package Java.Java0715.Question5;

public class Main {
   public static void main(String[] args) {
    Employee0901 sm = new SalesMan0901("営業部の社員A");

    Employee0901 dp = new Developer0901("開発部の社員B");

    Employee0901 gm = new GeneralManager0901("総務部の社員C");

    sm.goOffice();
    dp.goOffice();
    gm.goOffice();

    sm.work();
    dp.work();
    gm.work();

    sm.goHome();
    dp.goHome();
    gm.goHome();
   }
}
