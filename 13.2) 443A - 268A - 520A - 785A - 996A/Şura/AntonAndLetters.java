import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        input=input.substring(1,input.length()-1);
        String[] m=input.split(", ");
        HashSet<String> set=new HashSet<>(Arrays.asList(m));
        if (input.equals(""))
            System.out.println(0);
        else
            System.out.println(set.size());
    }
}
