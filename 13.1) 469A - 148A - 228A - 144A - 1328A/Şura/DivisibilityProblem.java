import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();

    scanner.nextLine();
        for (int i = 0; i < len; i++) {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x%y==0)
                System.out.println(0);
            else
                System.out.println(y-x%y);
            scanner.nextLine();
        }

    }
}
