import java.util.ArrayList;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();scanner.nextLine();
        for (int i = 0; i < len; i++) {
            int len1=scanner.nextInt();
            scanner.nextLine();
            int max=-1;
            int min=101;
            ArrayList<Integer> newarray=new ArrayList<>();
            for (int j = 0; j < len1; j++) {
                int new1 = scanner.nextInt();
                newarray.add(new1);
                if (new1 > max) {
                    max = new1;
                }
                if (new1 < min) {
                    min = new1;
                }
            }
            scanner.nextLine();
            boolean t=true;
            for (int j = min; j < max+1; j++) {
                if(!newarray.contains(j)){
                    System.out.println("NO");
                    t=false;
                    break;
                }
            }
            if(t){
                System.out.println("YES");
            }
        }
    }
}
