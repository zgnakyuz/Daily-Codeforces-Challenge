import java.util.Scanner;

public class DominoPiling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        if (m % 2 == 0) {
            System.out.println(m / 2 * n);
        } else {
            System.out.println(m / 2 * n + n / 2);
        }
    }
}
