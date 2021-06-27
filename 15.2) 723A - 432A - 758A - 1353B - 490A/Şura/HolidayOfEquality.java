import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();scanner.nextLine();
        int[] t=new int[x];
        int max=0;
        for (int i = 0; i < x; i++) {
            t[i]=scanner.nextInt();
            if(t[i]>max){
                max=t[i];
            }
        }
        int result=0;
        for (int i = 0; i < x; i++) {
            result+=max-t[i];
        }
        System.out.println(result);
    }
}
