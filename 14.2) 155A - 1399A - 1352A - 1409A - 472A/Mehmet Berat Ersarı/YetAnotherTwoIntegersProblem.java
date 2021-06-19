import java.util.*;

public class YetAnotherTwoIntegersProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a!=b){
                if((a-b)%10!=0){
                    System.out.println(Math.abs((int)(a-b)/10)+1);
                }else
                    System.out.println(Math.abs((int)(a-b)/10));
            }else
                System.out.println(0);

        }



    }
}


