import java.util.Scanner;

public class YetAnotherwoIntegersProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < len; i++) {
            int m=Math.abs(scanner.nextInt()-scanner.nextInt());
            String x=String.valueOf(m);
            int result=0;
            if(!String.valueOf(x.charAt(x.length()-1)).equals("0")){
                result++;
            }
            int r=0;
            for (int j = x.length()-2; j >= 0; j--) {
                result+=(int)(Integer.parseInt(String.valueOf(x.charAt(j)))*Math.pow(10,r));
                r++;
            }
            System.out.println(result);
            scanner.nextLine();
        }
    }
}
