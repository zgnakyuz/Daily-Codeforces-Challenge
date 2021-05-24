import java.util.Scanner;

public class WordCapitilization {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Character firstLetter=input.charAt(0);
        String x=firstLetter.toString();
        x=x.toUpperCase();
        System.out.println(x+input.substring(1));
    }
}
