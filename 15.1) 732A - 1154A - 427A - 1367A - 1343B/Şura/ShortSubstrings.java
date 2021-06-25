import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();scanner.nextLine();
        for (int i = 0; i < x; i++) {
            String m=scanner.nextLine();
            String result="";
            for (int j = 0; j < m.length(); j++) {
                if(j==0){
                    result+=m.charAt(j);
                }
                else if(j==m.length()-1){
                    result+=m.charAt(j);
                }
                else if(j%2==1){
                    result+=m.charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}
