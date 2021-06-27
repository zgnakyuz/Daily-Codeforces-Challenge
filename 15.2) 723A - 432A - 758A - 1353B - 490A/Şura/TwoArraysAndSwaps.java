import java.util.ArrayList;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();scanner.nextLine();
        for (int i = 0; i < len; i++) {
            int len1=scanner.nextInt();
            int swapsayisi=scanner.nextInt();scanner.nextLine();
            ArrayList<Integer> a=new ArrayList<>();
            ArrayList<Integer> b=new ArrayList<>();
            int suma=0;
            for (int j = 0; j < len1; j++) {
                a.add(scanner.nextInt());
                suma+=a.get(j);
            }scanner.nextLine();
            for (int j = 0; j < len1; j++) {
                b.add(scanner.nextInt());
            }scanner.nextLine();

             while (swapsayisi!=0){
                 swapsayisi--;
                 int min=31;
                 int max=0;
                 int maxindex=0;
                 int minindex=0;
                 for (int j = 0; j < len1; j++) {
                     if(a.get(j)<min){
                         min=a.get(j);
                         minindex=j;
                     }
                     if(b.get(j)>max){
                         max=b.get(j);
                         maxindex=j;
                     }
                 }
                 if(max>min){
                     a.remove(minindex);
                     b.remove(maxindex);
                     a.add(max);
                     b.add(min);
                     suma-=min-max;
                 }
             }
             System.out.println(suma);

        }
    }
}
