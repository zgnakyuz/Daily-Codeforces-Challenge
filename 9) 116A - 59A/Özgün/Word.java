import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        char[] letters = word.toCharArray();

        int upperCount = 0;
        int limit = word.length();  // remaining numbers' count

        for (int i = 0; ; i++) {

            if (Character.isUpperCase(letters[i])) upperCount++;
            else upperCount--;

            // if upperCount reset, we should decrease limit by traversed chars' count
            if (upperCount == 0) limit = word.length() - (i + 1);

            // if count of a case equals to remaining chars' count
            // and the case is lower (less than zero)
            // or the count is 0 (if it is 0 and equals to limit / 2,
            // it means all of the chars are traversed
            if (Math.abs(upperCount) == limit / 2.0 && upperCount <= 0) {
                System.out.println(word.toLowerCase());
                break;
            }

            if (Math.abs(upperCount) > limit / 2.0) {
                if (upperCount > 0) System.out.println(word.toUpperCase());
                else                System.out.println(word.toLowerCase());
                break;
            }
        }
    }
}
