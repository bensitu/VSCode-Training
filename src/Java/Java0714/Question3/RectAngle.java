package Java.Java0714.Question3;

public class RectAngle {
    int height;
    int width;

    public RectAngle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public RectAngle(int width) {
        this.width = width;
    }

    public int getMenseki() {
        if (height != 0) {
            return height * width;
        } else {
            return width * width;      
        }

    }
}
