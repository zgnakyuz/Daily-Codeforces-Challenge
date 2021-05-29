import java.util.Scanner;
import java.util.Stack;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s=scanner.nextLine();
        String t=scanner.nextLine();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String reverse="";
        for (int i = 0; i < s.length(); i++) {
            reverse+=stack.pop().toString();
        }
        if(reverse.equals(t)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
