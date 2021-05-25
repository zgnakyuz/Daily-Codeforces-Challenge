import java.util.Scanner;

public class WrongSubtraction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n = String.valueOf(input.nextInt());
        int k = input.nextInt();

        for (int i = n.length() - 1; ; i--) {
            int lastDigit = n.charAt(i) - '0';  // taking the integer itself

            if (lastDigit < k) {
                k -= lastDigit + 1;
            } else {
                // head of the number + the remainder
                System.out.println(n.substring(0, i) + (lastDigit - k));
                break;
            }
        }
    }
}
