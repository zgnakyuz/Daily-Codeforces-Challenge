import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int fence=scanner.nextInt();
        scanner.nextLine();
        int width=0;
        for (int i = 0; i < len; i++) {
            int x=scanner.nextInt();
            if(x<=fence){
                width++;
            }else{
                width+=2;
            }
        }
        System.out.println(width);
    }
}
