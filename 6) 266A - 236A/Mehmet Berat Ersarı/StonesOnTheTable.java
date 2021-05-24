import java.util.*;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
        String input= scanner.nextLine();
        int counter=0;
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)==input.charAt(i+1))
                counter++;
        }
        System.out.println(counter);
    }
}
