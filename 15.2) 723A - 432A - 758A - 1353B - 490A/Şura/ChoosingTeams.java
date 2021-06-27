import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int max=scanner.nextInt();
        scanner.nextLine();
        int result=0;
        for (int i = 0; i < len; i++) {
            int m=scanner.nextInt();
            if(max+m<=5){
                result++;
            }
        }
        System.out.println(result/3);
    }
}
