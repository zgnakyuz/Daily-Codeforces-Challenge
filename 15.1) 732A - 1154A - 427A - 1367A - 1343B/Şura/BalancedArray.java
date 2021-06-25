import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();scanner.nextLine();
        for (int i = 0; i < len; i++) {
            int x=scanner.nextInt();scanner.nextLine();
            if((x/2)%2==0){
                System.out.println("YES");
                for (int j = 1; j <= x; j++) {
                    if(j%2==0){
                        System.out.print(j+" ");
                    }
                }
                int last=0;
                int u=1;
                for (int j = 1; j < x/2; j++) {
                        System.out.print(u+" ");
                    if(j==x/2-1){
                        last=u+2;
                    }
                    u+=2;
                }
                System.out.print(last+x/2);
                System.out.println();
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
