import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n-- > 0) {
            String word = input.next();
            int lenWord = word.length();
            
            if (lenWord > 10) {
                String abbrv = String.valueOf(lenWord - 2);
                System.out.println(word.charAt(0) + abbrv
                        + word.charAt(lenWord - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
