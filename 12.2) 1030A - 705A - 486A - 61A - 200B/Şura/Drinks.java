import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double len= scanner.nextInt();
        scanner.nextLine();
        double p=0;
        for (int i = 0; i < len; i++) {
            p+=scanner.nextInt();
        }
        System.out.println(p/(len*100)*100);
    }
}
