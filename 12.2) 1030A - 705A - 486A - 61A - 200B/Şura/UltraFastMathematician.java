import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String t=scanner.nextLine();
        String m= scanner.nextLine();
        String x="";
        for (int i = 0; i < t.length(); i++) {
            int s=Integer.parseInt(Character.toString(t.charAt(i)));
            int n=Integer.parseInt(Character.toString(m.charAt(i)));
            s+=n;
            x+=s;
        }
        System.out.println(x.replace("2","0"));
    }
}