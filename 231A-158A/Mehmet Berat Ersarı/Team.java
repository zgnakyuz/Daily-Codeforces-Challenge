import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner lines = new Scanner(System.in);
        int n = lines.nextInt();
        int numberOfknow=0;
        for(int i=0;i<n;i++){
            int a= lines.nextInt();
            int b= lines.nextInt();
            int c= lines.nextInt();
            if(a+b+c>1)
                numberOfknow++;
        }
        System.out.println(numberOfknow);
    }
}
