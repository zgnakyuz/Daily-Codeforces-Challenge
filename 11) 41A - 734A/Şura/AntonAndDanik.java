import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        scanner.nextLine();
        String s=scanner.nextLine();
        int Anton=0;
        int Danik=0;
        char a="A".charAt(0);
        for (int i = 0; i < len; i++) {
            if(s.charAt(i)==a){
                Anton++;
            }else{
                Danik++;
            }
        }
        if(Anton==Danik){
            System.out.println("Friendship");
        }
        else if(Anton>Danik){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
    }
}
