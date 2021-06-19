import java.util.HashSet;
import java.util.Scanner;

public class Horseshoe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashSet<Integer> x=new HashSet<>();
        for (int i = 0; i < 4; i++) {
            x.add(scanner.nextInt());
        }
        System.out.println(4-x.size());
    }
}
