import java.util.Scanner;

public class SoliderAndBananas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        int c=scanner.nextInt();
        int total=0;
        for (int i = 0; i < c; i++) {
            int pay= a+a*i;
            total+=pay;
        }
        if(total>b)
            System.out.println(total-b);
        else
            System.out.println(0);
    }
}
