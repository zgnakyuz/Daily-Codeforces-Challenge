import java.util.Scanner;

public class BearAndBigBrother {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextInt();

        int years = (int) (Math.log(a / b) / Math.log(2 / 3.0)) + 1;

        // If the (a/b) equals to (2/3)^power, we need to add 1
        // due to computer's calculation errors
        double power = Math.pow(a, 1 / 2.0);
        if (a != 1 && power == (int) power && Math.pow(3, power) == b) {
            years++;
        }

        System.out.println(years);
    }
}
