import java.util.Scanner;

public class Tram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int stopCount = input.nextInt();

        int count = 0;
        int max = count;

        while (stopCount-- > 0) {
            int ai = input.nextInt();
            int diff = input.nextInt() - ai;

            count += diff;

            if (count > max) max = count;
        }

        System.out.println(max);
    }
}
