import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int teams= scanner.nextInt();
        scanner.nextLine();
        int[] host=new int[teams];
        int[] ghost=new int[teams];
        for (int i = 0; i < teams; i++) {
            int first= scanner.nextInt();
            host[i]=first;
            int second= scanner.nextInt();
            ghost[i]=second;
            scanner.nextLine();
        }
        int result=0;
        for (int i = 0; i < teams; i++) {
            for (int j = 0; j < teams; j++) {
                if(host[i]==ghost[j]){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
