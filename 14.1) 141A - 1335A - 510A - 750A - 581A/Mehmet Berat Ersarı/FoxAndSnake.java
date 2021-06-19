import java.util.*;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int counter2=0;
        for(int i=1;i<a+1;i++){
            if(i%2==1){
                System.out.println("#".repeat(b));
            }else{
                if(counter2%2==0){
                    System.out.print(".".repeat(b-1));
                    System.out.println("#");
                    counter2++;
                }else{
                    System.out.print("#");
                    System.out.println(".".repeat(b-1));
                    counter2++;
                }
            }
        }
    }
}


