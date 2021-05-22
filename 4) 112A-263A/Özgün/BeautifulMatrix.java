import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (input.nextInt() == 1) {
                    System.out.println(Math.abs(i - 3) + Math.abs(j - 3));
                    break;
                }
            }
        }
    }
}
