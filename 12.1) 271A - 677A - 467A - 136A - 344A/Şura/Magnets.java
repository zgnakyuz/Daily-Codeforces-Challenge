import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        scanner.nextLine();
        int previous=0;
        int groups=0;
        for (int i = 0; i < len; i++) {
            int neew=scanner.nextInt();
            if(neew!=previous){
                groups++;
            }
            previous=neew;
        }
        System.out.println(groups);
    }
}
