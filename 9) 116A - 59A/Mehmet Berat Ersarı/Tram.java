import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int in=0;
        int max=in;
        for(int i=0; i<n;i++){
            int a=sc.nextInt();
            int b= sc.nextInt();
            in-=a;
            in+=b;
            if(in>max)
                max=in;
        }
        System.out.println(max);
    }
}
