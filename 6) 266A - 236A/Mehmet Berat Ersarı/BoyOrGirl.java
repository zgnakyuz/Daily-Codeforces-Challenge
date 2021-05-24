import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        HashSet<Character> character=new HashSet<>();
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
