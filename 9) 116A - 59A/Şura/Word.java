import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int lowercase=0;
        int uppercase=0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==input.toUpperCase().charAt(i)){
                uppercase++;
            }
            else {
                lowercase++;
            }
        }
        if(lowercase>=uppercase){
            System.out.println(input.toLowerCase());
        }else {
            System.out.println(input.toUpperCase());
        }
    }
}
