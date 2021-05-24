import java.util.*;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int counter=0;
        while(true){
            a=a*3;
            b=b*2;
            counter++;
            if(a>b){
                break;
            }
        }
        System.out.println(counter);
    }
}
