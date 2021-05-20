import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] split=input.split(" ");
        int square=Integer.parseInt(split[0])*Integer.parseInt(split[1]);
        System.out.println(square/2);
    }
}
