import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        for (int i = 1; i < len+1; i++) {
            if (i % 2 == 1) {
                System.out.print("I hate ");
            }
            else{
                System.out.print("I love ");
            }
            if(i==len){
                System.out.print("it");
            }else {
                System.out.print("that ");
            }
        }
    }
}
