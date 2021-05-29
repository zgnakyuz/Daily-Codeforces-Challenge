import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int counter = 0;
        while (true) {
            if (a > 4) {
                counter++;
                a -= 5;
            } else if (a > 3) {
                counter++;
                a -= 4;

            } else if (a > 2) {
                counter++;
                a -= 3;

            } else if (a > 1) {
                counter++;
                a -= 2;

            } else if (a > 0) {
                counter++;
                a -= 1;
            } else {
                break;
            }

        }
        System.out.println(counter);
    }
}
