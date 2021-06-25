import java.util.*;

public class PoliceRecruits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int policemans=0;
        int counter=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a>0){
                policemans+=a;
            }else
                if(policemans>0){
                    policemans+=a;
                    continue;
                }else
                    counter++;
        }
        System.out.println(counter);



    }

}



