import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long x=scanner.nextLong();
        if(x%2==0){
            System.out.println(x/2);
        }else{
            System.out.println((x-1)/2-x);
        }
    }
}
