import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int result=0;
        while (input!=0){
            if(input>=100){
                input-=100;
                result++;
            }
            else if(input>=20){
                input-=20;
                result++;
            }
            else if(input>=10){
                input-=10;
                result++;
            }
            else if(input>=5){
                input-=5;
                result++;
            }
            else if(input>=1){
                input-=1;
                result++;
            }
        }
        System.out.println(result);
    }
}
