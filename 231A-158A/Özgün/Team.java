import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;

        while (n-- > 0) {
            int f = input.nextInt();  // first
            int s = input.nextInt();  // second
            int t = input.nextInt();  // third

            if (f + s + t > 1) result++;
        }

        System.out.println(result);
    }
}
