import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len= scanner.nextInt();
        scanner.nextLine();
        int result=0;
        for (int i = 0; i < len; i++) {
            int now=scanner.nextInt();
            int max=scanner.nextInt();
            if(max-now>=2){
             result++;
            }
            scanner.nextLine();
        }
        System.out.println(result);
    }
}
