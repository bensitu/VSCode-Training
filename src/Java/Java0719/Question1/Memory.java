package Java.Java0719.Question1;

public class Memory implements USBConnectable {

    @Override
    public void connect() {
        System.out.println("Memort connected.");
        
    }

    @Override
    public void disConnect() {
        System.out.println("Memory disconnected.");
        
    }
    
}
