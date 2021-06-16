import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n= sc.nextInt();
        double toplam=0.0;
        double result=0.0;
        for(int i=0;i<n;i++){
            toplam+=sc.nextInt();
        }
        System.out.println(toplam/n);


    }
}
