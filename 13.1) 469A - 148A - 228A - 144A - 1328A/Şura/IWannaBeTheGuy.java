import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int level=scanner.nextInt();
        scanner.nextLine();
        HashSet<Integer> X=new HashSet<>();
        String[] levelx=scanner.nextLine().split(" ");
        for (int i = 0; i < levelx.length; i++) {
            X.add(Integer.parseInt(levelx[i]));
        }
        String[] levely=scanner.nextLine().split(" ");
        for (int j = 0; j < levely.length; j++) {
            X.add(Integer.parseInt(levely[j]));
        }
        boolean one=true;
        for (int i = 1; i < level+1; i++) {
            if(!X.contains(i)){
                System.out.println("Oh, my keyboard!");
                one=false;
                break;
            }
        }
        if(one) System.out.println("I become the guy.");
    }
}
