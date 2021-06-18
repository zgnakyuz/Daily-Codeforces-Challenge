import java.util.*;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int counter=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a%b;
            if(c==0)
                System.out.println("0");
            else
                System.out.println(b-c);
            }
        }

    }


