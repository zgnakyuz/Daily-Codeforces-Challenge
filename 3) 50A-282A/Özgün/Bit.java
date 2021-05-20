import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;

        while (n-- > 0) {
            String op = input.next();

            if (op.charAt(1) == '+')    x++;
            else                        x--;
        }

        System.out.println(x);
    }
}
