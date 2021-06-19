import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int len= scanner.nextInt();scanner.nextLine();
    int amazing1=scanner.nextInt();
    int amazing2=amazing1;
    int result=0;
        for (int i = 0; i < len-1; i++) {
            int new1=scanner.nextInt();
            if(new1>amazing1){
                result++;
                amazing1=new1;
            }
            if(new1<amazing2){
                result++;
                amazing2=new1;
            }
        }
        System.out.println(result);
    }
}
