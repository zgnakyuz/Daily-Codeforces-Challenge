import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] n = String.valueOf(input.nextLong()).toCharArray();

        int count = 0;

        for (char ch : n) if (ch == '4' || ch == '7') count++;

        if (count == 4 || count == 7)   System.out.println("YES");
        else                            System.out.println("NO");
    }
}
