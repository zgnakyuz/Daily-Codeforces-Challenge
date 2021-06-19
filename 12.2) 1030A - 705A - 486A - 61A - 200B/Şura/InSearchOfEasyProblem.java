import java.util.Scanner;

public class InSearchOfEasyProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        scanner.nextLine();
        boolean Easy=true;
        for (int i = 0; i < len; i++) {
            if(scanner.nextInt()==1){
                Easy=false;
            }
        }
        if(Easy){
            System.out.println("EaSY");
        }
        else{
            System.out.println("HARD");
        }
    }
}
