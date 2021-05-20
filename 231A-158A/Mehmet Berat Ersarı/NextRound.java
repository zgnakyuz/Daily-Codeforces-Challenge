import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner lines = new Scanner(System.in);
        int n = lines.nextInt();
        int k=lines.nextInt();
        int numberOfContestant=0;
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            numbers[i]= lines.nextInt();
        }
        int constant=numbers [k-1];
        for(int temp:numbers){
            if(temp>=constant && temp>0){
                numberOfContestant++;
            }
        }
        System.out.println(numberOfContestant);
    }
}
