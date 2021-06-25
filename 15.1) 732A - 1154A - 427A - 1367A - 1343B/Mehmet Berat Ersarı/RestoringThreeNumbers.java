import java.util.*;

public class RestoringThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int max=a;
        int[] array= new int[]{a, b, c, d};
        for(int temp:array){
            if(temp>max){
                max=temp;
            }
        }
        for(int temp:array){
            if(temp==max)
                continue;
            System.out.print(max-temp+" ");
        }


    }

}



