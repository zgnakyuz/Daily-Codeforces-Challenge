import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int print=0;
        for(int i=0; number>i;i++){
            String line= scanner.nextLine();
            String[] split=line.split(" ");
            int decided=0;
            for (String s:split) {
                if(Integer.parseInt(s)==1){
                    decided++;
                }
            }
            if (decided>=2){
                print++;
            }
        }
        System.out.println(print);
    }
}
