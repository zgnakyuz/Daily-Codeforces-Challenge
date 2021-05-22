import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1));
    }
}
