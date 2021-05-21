import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String first= scanner.nextLine();
        String second= scanner.nextLine();
        first=first.toLowerCase();
        second=second.toLowerCase();
        if(first.compareTo(second)>0){
            System.out.println("1");
        }
        else if(second.compareTo(first)>0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
    }
}
