import java.util.random.RandomGenerator;


public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.print("||");
        RandomGenerator generator = RandomGenerator.getDefault();
        int pBar = 0;
        int random = generator.nextInt(1, 5);
        while (pBar < 10) {
            if (random == 2) {
                System.out.print("*");
                pBar += 1;
            }
            Thread.sleep(1000);
        }
        System.out.println("|| -- Loaded Terminal");
    }
}
