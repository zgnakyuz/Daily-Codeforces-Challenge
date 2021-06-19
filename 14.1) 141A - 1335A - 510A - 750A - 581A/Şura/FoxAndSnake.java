import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int satir=1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(satir%2==1){
                    System.out.print("#");
                }
                else if(satir%2==0){
                    if((satir/2)%2==1){
                        if(j==y-1){
                            System.out.print("#");
                        }
                        else{
                            System.out.print(".");
                        }
                    }
                    else {
                        if(j==0){
                            System.out.print("#");
                        }
                        else{
                            System.out.print(".");
                        }
                    }
                }
            }
            System.out.println();
            satir++;
        }

    }
}
