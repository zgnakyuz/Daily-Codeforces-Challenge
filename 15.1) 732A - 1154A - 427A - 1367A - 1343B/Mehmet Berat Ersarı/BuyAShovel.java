import java.util.*;

public class BuyAShovel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();

        for(int i=1;i<11;i++ ){
            int mod= (n*i)%10;
            if(mod==0 || mod==k){
                System.out.println(i);
                break;
            }
        }
    }

}



