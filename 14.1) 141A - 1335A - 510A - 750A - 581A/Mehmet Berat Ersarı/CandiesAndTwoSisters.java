import java.util.*;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            if(b>2){
                if(b%2==1){
                    System.out.println(b/2);
                }else
                    System.out.println((b/2)-1);

            }else
                System.out.println("0");
        }
    }
}


