import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashSet<Character> character=new HashSet<>();
        String input=scanner.nextLine();
        for(int i=0; input.length()>i;i++){
            character.add(input.charAt(i));
        }
        if(character.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
