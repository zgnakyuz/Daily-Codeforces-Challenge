import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        int x=0;
        while (true){

            if(a>b){
                break;
            }
            else {
                a=a*3;
                b=b*2;
            }
            x++;
        }
        System.out.println(x);
    }
}
