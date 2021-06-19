import java.util.*;

public class DesignTutorialLearnfromMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.print((4+" "+(n-4)));
        }
        else
        {
            System.out.print(9+" "+(n-9));
        }
    }

}



