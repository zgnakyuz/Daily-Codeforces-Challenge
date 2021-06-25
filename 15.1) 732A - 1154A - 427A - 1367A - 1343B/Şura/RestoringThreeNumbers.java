import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        int third=scanner.nextInt();
        int four=scanner.nextInt();

        if((first+second+third)/2==four){
            System.out.print(four-first+" ");
            System.out.print(four-second+" ");
            System.out.print(four-third+" ");
        }
        else if ((first+second+four)/2==third){
            System.out.print(third-first+" ");
            System.out.print(third-second+" ");
            System.out.print(third-four+" ");
        }
        else if((first+four+third)/2==second){
            System.out.print(second-first+" ");
            System.out.print(second-four+" ");
            System.out.print(second-third+" ");
        }
        else if((four+second+third)/2==first){
            System.out.print(first-four+" ");
            System.out.print(first-second+" ");
            System.out.print(first-third+" ");
        }
    }
}
