import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        scanner.nextLine();
        String Stones=scanner.nextLine();
        char first=Stones.charAt(0);
        int output=0;
        for(int i=1;number>i;i++){
            char second=Stones.charAt(i);
            if(first==second){
                output++;
            }
            first=second;
        }
        System.out.println(output);
    }
}
