import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        if(input.toUpperCase().charAt(0)==input.charAt(0)){
            System.out.println(input);
        }
        else{
            Character firstLetter=input.charAt(0);
            String x=firstLetter.toString();
            x=x.toUpperCase();
            System.out.println(x+input.substring(1));
        }
    }
}
