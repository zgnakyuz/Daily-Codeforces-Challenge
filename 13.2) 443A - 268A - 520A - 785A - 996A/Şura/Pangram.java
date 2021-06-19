import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        scanner.nextLine();
        String w=scanner.nextLine();
        HashSet<String> word=new HashSet<>();
        w=w.toLowerCase();
        for (int i = 0; i < len; i++) {
            word.add(String.valueOf(w.charAt(i)));
        }
        String[] C={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j","k", "l", "m", "n", "o","p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        boolean control=true;
        for (int i = 0; i < C.length; i++) {
            if(!word.contains(C[i])){
                System.out.println("NO");
                control=false;
                break;
            }
        }
        if(control)
            System.out.println("YES");
    }
}
