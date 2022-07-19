package Java.Java0716.Question1;

public class Mouse implements USBConnectable {

    @Override
    public void connect() {
        System.out.println("Mouse connected.");
        
    }

    @Override
    public void disConnect() {
       System.out.println("Mouse disconnected.");
        
    }
    
}
