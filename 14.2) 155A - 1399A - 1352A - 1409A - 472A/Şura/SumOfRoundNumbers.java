import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();scanner.nextLine();
        for (int i = 0; i < len; i++) {
            String number=scanner.nextLine();
            int x=0;
            String a="";
            int r=0;
            for (int j = number.length()-1; j > -1; j--) {
                String n=String.valueOf(number.charAt(j));
                if(Integer.parseInt(n)!=0){
                    int m=(int)(Integer.parseInt(n)*Math.pow(10,x));
                    a+=m+" ";
                    r++;
                }
                x++;
            }
            System.out.println(r);
            System.out.println(a);
        }
    }
}
