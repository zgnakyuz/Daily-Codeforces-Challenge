import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input=scanner.nextInt();
        if(input%5==0)
        System.out.println(input/5);
        else
            System.out.println(input/5+1);
    }
}
