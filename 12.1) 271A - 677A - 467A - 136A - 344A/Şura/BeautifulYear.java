import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        boolean s=true;
        while(s){
            first++;
            String x=String.valueOf(first);
            char one=x.charAt(0);
            char two=x.charAt(1);
            char three=x.charAt(2);
            char four=x.charAt(3);
            s=( one == two || one == three || one == four || two == three || two == four || three == four);
        }
        System.out.println(first);

    }


}
