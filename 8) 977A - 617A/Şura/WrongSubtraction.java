import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        for (int i = 0; i < y; i++) {
            if(x%10==0)
                x=x/10;
            else
                x=x-1;
        }
        System.out.println(x);
    }
}
