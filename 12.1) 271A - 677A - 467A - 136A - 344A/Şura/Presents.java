import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int[] array=new int[len];
        for (int i = 1; i < len+1; i++) {
            int s=scanner.nextInt();
            array[s-1]=i;
        }
        for (int j = 0; j < len; j++) {
            System.out.print(array[j]);
            System.out.print(" ");
        }
    }
}
