import com.sun.javafx.runtime.async.AbstractRemoteResource;

import java.util.Scanner;

public class LearnFromMath {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int x=number/2;
        int y=Math.abs(number-x);
        boolean ty=true;
        while (ty){
            for (int i = 2; i <= Math.sqrt(y); i++) {
                if (y % i == 0) {
                    boolean tx = true;
                    ty = false;
                    for (int j = 2; j <= Math.sqrt(x); j++) {
                        if (x % j == 0) {
                            System.out.println(x + " " + y);
                            tx = true;
                            break;
                        } else {
                            tx = false;
                        }
                    }
                    if (tx) {
                        break;
                    }
                    if(!tx){
                        ty=true;
                    }

                } else {
                    ty = true;
                }
            }
            y--;
            x++;
        }
    }
}
