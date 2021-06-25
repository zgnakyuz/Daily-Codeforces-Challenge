import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int m=1;
        while (true){
            if((x*m)%10==0 || (x*m-y)%10==0){
                break;
            }
            m++;
        }
        System.out.println(m);
    }
}
