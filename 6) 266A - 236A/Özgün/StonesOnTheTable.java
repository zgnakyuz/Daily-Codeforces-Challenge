import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        if (count > 1) {
            String str = input.next();
            int result = 0;

            char ch_prev = str.charAt(--count);
            do {
                char ch_next = str.charAt(--count);

                if (ch_next == ch_prev) result++;
                else ch_prev = ch_next;
            } while (count > 0);

            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
