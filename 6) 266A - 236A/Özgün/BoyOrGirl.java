import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user_name = input.next();
        HashSet<Character> chars = new HashSet<>();

        for (int i = 0; i < user_name.length(); i++) {
            chars.add(user_name.charAt(i));
        }

        if (chars.size() % 2 == 1)  System.out.print("IGNORE HIM!");
        else                        System.out.print("CHAT WITH HER!");
    }
}
