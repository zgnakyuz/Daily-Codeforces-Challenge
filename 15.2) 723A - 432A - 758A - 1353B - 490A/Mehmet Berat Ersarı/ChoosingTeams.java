import java.util.*;

public class ChoosingTeams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int control=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k<(6-a))
                control++;

        }
        System.out.println(control/3);











    }

}



