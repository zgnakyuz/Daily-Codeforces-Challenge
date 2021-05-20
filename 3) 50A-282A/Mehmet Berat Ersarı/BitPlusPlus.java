import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner lines = new Scanner(System.in);
        int numberOfLines= lines.nextInt();
        int a=0;
        for (int i=0; i<numberOfLines;i++){
            String line= lines.next();
            if(line.equals("++X") || line.equals("X++"))
                a++;
            else
                a--;
        }
        System.out.println(a);

        }
    }

