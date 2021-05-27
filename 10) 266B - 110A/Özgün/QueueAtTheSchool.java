import java.util.ArrayList;
import java.util.Scanner;

public class QueueAtTheSchool {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int t = input.nextInt();
        char[] str = input.next().toCharArray();
        ArrayList<Integer> boysIndex = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'B') {
                boysIndex.add(i);
            }
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < boysIndex.size(); j++) {
                int index = boysIndex.get(j);
                if (index + 1 > str.length - 1) {
                    break;
                }

                if (str[index + 1] == 'G') {
                    str[index + 1] = 'B';
                    str[index] = 'G';
                    boysIndex.set(j, index + 1);
                }
            }
        }

        System.out.println(str);
    }
}
