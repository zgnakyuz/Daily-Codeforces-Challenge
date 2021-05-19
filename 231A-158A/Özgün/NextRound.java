import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int th = 0;  // threshold
        int result = 0;

        for (int i = 0; i < k; i++) {  // checking first k numbers
            th = input.nextInt();
            if (th > 0) result++;
        }

        n -= k;  // to check other equal numbers in while loop

        // if th == 0, remaining numbers are 0 too
        if (th != 0) {
            while (n-- > 0) {
                int num = input.nextInt();

                if (num != th) {
                    break;
                }

                result++;
            }
        }

        System.out.println(result);
    }
}
