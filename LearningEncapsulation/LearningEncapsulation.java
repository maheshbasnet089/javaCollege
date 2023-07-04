
package LearningEncapsulation;

public class LearningEncapsulation {
    private int height = 20;
    private int width = 10;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setWidth(int w) {
        width = w;
    }

}

class TestEncapsulation {
    public static void main(String[] args) {
        LearningEncapsulation le = new LearningEncapsulation();
        System.out.println("Height: " + le.getHeight());
        System.out.println("Width: " + le.getWidth());
        le.setHeight(30);
        le.setWidth(20);
        System.out.println("Height: " + le.getHeight());
        System.out.println("Width: " + le.getWidth());
    }
}
