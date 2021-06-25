import java.util.*;

public class BalancedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k%4==0){
                System.out.println("YES");
                int a=k/2;
                int b=k/2;
                int u=2;
                int y=1;
                int toplam=0;
                int toplam2=0;
                while(a--!=0){
                    System.out.print(u+" ");
                    toplam+=u;
                    u+=2;
                }
                while(b--!=0){
                    if(b==0){
                        System.out.print(toplam-toplam2);
                    }else
                        System.out.print(y+" ");
                    toplam2+=y;
                    y+=2;
                }
                System.out.println();
            }else{
                System.out.println("NO");
            }

        }






    }

}



