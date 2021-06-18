import java.util.ArrayList;
import java.util.Scanner;

public class IWannaBetheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String a=sc.nextLine();
        String[] x=sc.nextLine().split(" ");
        String[] y=sc.nextLine().split(" ");
        ArrayList<String> all=new ArrayList<>();
        for(String temp: x){
            all.add(temp);
        }
        for(String temp: y){
            all.add(temp);
        }
        boolean control=false;
        for(int i=1;i<n+1;i++){
            String b=Integer.toString(i);
            if(!all.contains(b)){
                control=true;
                break;
            }
        }
        if(control)
            System.out.println("Oh, my keyboard!");
        else
            System.out.println("I become the guy.");

    }
}
