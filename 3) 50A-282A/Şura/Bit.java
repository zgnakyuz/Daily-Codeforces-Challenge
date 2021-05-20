import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstLine= Integer.parseInt(scanner.nextLine());
        int x=0;
        for(int i=0; firstLine>i;i++) {
            String line=scanner.nextLine();
            if (line.startsWith("++X") || line.startsWith("X++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
