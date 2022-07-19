package Java.Java0719.Question1;

public class CardReader implements USBConnectable {

    @Override
    public void connect() {
        System.out.println("CardReader connected.");
    }

    @Override
    public void disConnect() {
       System.out.println("CardReader disconnected.");
        
    }
    
}
