import java.util.*;

public class I_love_username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int max=sc.nextInt();
        int min=max;
        int counter1=0;
        for(int i=1;i<a;i++){
            int b=sc.nextInt();
            if(b>max){
                counter1++;
                max=b;
            }else if (b<min){
                counter1++;
                min=b;
            }
        }
        System.out.println(counter1);


    }
}


