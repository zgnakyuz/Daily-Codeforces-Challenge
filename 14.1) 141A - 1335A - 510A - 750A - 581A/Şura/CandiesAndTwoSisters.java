import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int leninput=scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < leninput; i++) {
            int first=scanner.nextInt();
            if(first<=2){
                System.out.println(0);
            }
            else{
                if(first%2==0){
                    System.out.println(first/2-1);
                }
                else{
                    System.out.println((first-1)/2);
                }
            }
            scanner.nextLine();
        }
    }
}
