import java.util.*;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int counter=0;
        while(true){
            if(n>=100){
                counter++;
                n-=100;
            }else if(n>=20){
                counter++;
                n-=20;
            }else if(n>=10){
                counter++;
                n-=10;
            }else if(n>=5){
                counter++;
                n-=5;
            }else if(n>=1){
                counter++;
                n-=1;
            }else if(n==0)
                break;
        }
        System.out.println(counter);


    }
}


