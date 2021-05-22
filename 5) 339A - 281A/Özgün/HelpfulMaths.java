import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] original = input.next().split("\\+");

        Arrays.sort(original);
        int lastIndex = original.length - 1;

        for (int i = 0; i < lastIndex; i++) {
            System.out.print(original[i] + "+");
        }
        System.out.print(original[lastIndex]);
    }
}
