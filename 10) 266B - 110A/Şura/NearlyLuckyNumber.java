import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int nearly=0;
        char x="4".charAt(0);
        char y="7".charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==x || input.charAt(i)==y){
                nearly++;
            }
        }
        if(nearly==4||nearly==7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
