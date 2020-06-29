import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Random random = new Random();
        int randomizeNumber = random.nextInt(100);

        circle = new Circle("brown", true, 7.5);
        System.out.println("Before-resize: " + circle);
        circle.resize(randomizeNumber);
        System.out.println("After-resize upto " + (100+randomizeNumber) + "%: " + circle);
    }
}
