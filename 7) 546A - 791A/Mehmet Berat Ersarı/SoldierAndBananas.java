import java.util.*;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int toplam=0;
        for(int i=0;i<c;i++){
            toplam+=a*(i+1);
        }
        if(toplam-b>0)
            System.out.println(toplam-b);
        else
            System.out.println("0");
    }
}
