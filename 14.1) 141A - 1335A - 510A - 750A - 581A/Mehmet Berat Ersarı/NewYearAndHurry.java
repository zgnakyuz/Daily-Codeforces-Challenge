import java.util.*;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1; i<a+1;i++){
            b+=i*5;
            if(b>240){
                System.out.println(i-1);
                break;
            }else if(i==a){
                System.out.println(i);
            }

        }
    }
}


