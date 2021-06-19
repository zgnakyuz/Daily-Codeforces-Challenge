import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        scanner.nextLine();
        String[] all=scanner.nextLine().split(" ");
        int maxindex=0;
        int minindex=0;
        for (int i = 1; i < len; i++) {
            if(Integer.parseInt(all[i])>Integer.parseInt(all[maxindex])){
                maxindex=i;
            }
            if(Integer.parseInt(all[i])<=Integer.parseInt(all[minindex])){
                minindex=i;
            }
        }
        if(maxindex>minindex)
            System.out.println(maxindex+len-(minindex+1)-1);
        else
            System.out.println(maxindex+len-(minindex+1));
    }
}
