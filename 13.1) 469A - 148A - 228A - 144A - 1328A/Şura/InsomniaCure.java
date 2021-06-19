import java.util.Scanner;

public class InsomniaCure {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[4];
        int k=scanner.nextInt();scanner.nextLine();
        numbers[0]=k;
        int l=scanner.nextInt();scanner.nextLine();
        numbers[1]=l;
        int m=scanner.nextInt();scanner.nextLine();
        numbers[2]=m;
        int n=scanner.nextInt();scanner.nextLine();
        numbers[3]=n;
        int d=scanner.nextInt();
        String[] dragons=new String[d];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <d; j++) {
                if((j+1)%numbers[i]==0){
                    dragons[j]="hurt";
                }
            }
        }
        for (String x:dragons) {
            if(x==null){
                d--;
            }
        }
        System.out.println(d);
    }
}
