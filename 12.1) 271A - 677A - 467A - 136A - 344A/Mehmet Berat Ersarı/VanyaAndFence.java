import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int h=sc.nextInt();
        int counter=0;
        for(int i=0; i<n;i++){
            int b=sc.nextInt();
            if(b>h)
                if(b%h==0)
                    counter+=b/h;
                else
                    counter+=(b/h)+1;
            else
                counter++;
        }
        System.out.println(counter);

    }
}
