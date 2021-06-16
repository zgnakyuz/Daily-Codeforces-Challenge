import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int easy=0;
        int hard=0;
        for(int i=0;i<n;i++){
            if(sc.nextInt()==0)
                easy++;
            else
                hard++;
        }
        if(hard>0)
            System.out.println("HARD");
        else
            System.out.println("EASY");



    }
}
