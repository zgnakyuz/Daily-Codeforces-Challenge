import java.util.Scanner;

public class Elephant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coord = input.nextInt();
        int remainder = coord % 5;
        int result = coord / 5;  // initiating

        if (remainder != 0) result++;

        System.out.println(result);
    }
}
