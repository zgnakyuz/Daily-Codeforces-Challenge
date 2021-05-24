import java.util.Scanner;

public class SoldierAndBananas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int n = input.nextInt();
        int w = input.nextInt();

        int borrow = (w * w + w) / 2 * k - n;  // sum formula - money
        System.out.println(Math.max(borrow, 0));
    }
}
