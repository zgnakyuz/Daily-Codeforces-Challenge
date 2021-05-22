import java.util.Locale;
import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next().toLowerCase(Locale.ROOT);
        String s2 = input.next().toLowerCase(Locale.ROOT);

        int value = s1.compareTo(s2);

        if (value > 0)      System.out.println(1);
        else if (value < 0) System.out.println(-1);
        else                System.out.println(0);
    }
}
