import java.util.ArrayList;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String first=scanner.nextLine();
        String second=scanner.nextLine();
        String third=scanner.nextLine();
        boolean control=true;
        ArrayList<String> x=new ArrayList<>();
        for (int i = 0; i <third.length() ; i++) {
            x.add(String.valueOf(third.charAt(i)));
        }
        for (int i = 0; i < first.length(); i++) {
            if(x.contains(String.valueOf(first.charAt(i)))){
                x.remove(String.valueOf(first.charAt(i)));
            }else {
                control=false;
                break;
            }
        }
        for (int i = 0; i <second.length() ; i++) {
            if(x.contains(String.valueOf(second.charAt(i)))){
                x.remove(String.valueOf(second.charAt(i)));
            }else {
                control=false;
                break;
            }
        }
        if(control & x.size()==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
