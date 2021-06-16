import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            int k = a[i];
            b[k-1] = i;
        }

        for (int j : b) System.out.print(j + 1 + " ");

    }
}
