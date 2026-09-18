import java.util.random.RandomGenerator;
import java.util.Scanner; // 1. Import the Scanner class


public class CodeVersion1 {
    public static void main(String[] args) throws InterruptedException {
        RandomGenerator generator = RandomGenerator.getDefault();
        Scanner scanner = new Scanner(System.in);
        int Xcoord = 3;
        int Ycoord = 3;
        boolean inputdebounce = false;
        boolean tempfix = true;
        while (tempfix) {
            for (int asdf = 0; asdf < 5; asdf++) {
                System.out.println("-----------------");
                for (int i = 1; i < 6; i++) {
                    if (i != Ycoord) {
                        System.out.println("| *  *  *  *  * |");
                    } else if (i == Ycoord) {
                        if (Xcoord == 1) {
                            System.out.println("| @  *  *  *  * |");
                        } else if (Xcoord == 2) {
                            System.out.println("| *  @  *  *  * |");
                        } else if (Xcoord == 3) {
                            System.out.println("| *  *  @  *  * |");
                        } else if (Xcoord == 4) {
                            System.out.println("| *  *  *  @  * |");
                        } else if (Xcoord == 5) {
                            System.out.println("| *  *  *  *  @ |");
                        }
                    }
                }
                System.out.println("-----------------");
                while (!inputdebounce) {
                    if (scanner.hasNextInt()) {
                        int keyCode = scanner.nextInt();
                        if (keyCode == 87 || keyCode == 38) {            // up
                            inputdebounce = true;
                            Ycoord += 1;
                            if (Ycoord > 5) {
                                Ycoord = 1;
                            }
                        } else if (keyCode == 65 || keyCode == 37) {     // left
                            inputdebounce = true;
                            Xcoord -= 1;
                            if (Xcoord < 1) {
                                Xcoord = 5;
                            }
                        } else if (keyCode == 83 || keyCode == 40) {     // down
                            inputdebounce = true;
                            Ycoord -= 1;
                            if (Ycoord < 1) {
                                Ycoord = 5;
                            }
                        } else if (keyCode == 68 || keyCode == 39) {     // right
                            inputdebounce = true;
                            Xcoord += 1;
                            if (Xcoord > 5) {
                                Xcoord = 1;
                            }
                        }
                    }
                }
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
            }
        }
    }
}