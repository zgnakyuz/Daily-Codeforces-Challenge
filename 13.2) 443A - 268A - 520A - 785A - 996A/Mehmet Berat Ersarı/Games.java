import java.util.*;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Integer[] a= new Integer[n];
        Integer[] b= new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int counter=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j])
                    counter++;

            }
        }
        System.out.println(counter);



    }
}


