import java.util.Scanner;

public class BeatifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        Boolean control=false;
        while (true){
            a++;
            String b=Integer.toString(a);
            if(b.charAt(0)!=b.charAt(1) && b.charAt(0)!=b.charAt(2) && b.charAt(0)!=b.charAt(3) && b.charAt(1)!=b.charAt(2) && b.charAt(1)!=b.charAt(3) && b.charAt(2)!=b.charAt(3))
                control=true;

            if (control){
                break;
            }
        }
        System.out.println(a);
    }
}
