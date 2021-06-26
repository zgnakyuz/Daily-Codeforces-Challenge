import java.util.*;

public class TwoArraysAndSwaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t--!=0){
            String[] nAndk=sc.nextLine().split(" ");
            int n=Integer.parseInt(nAndk[0]);
            int k=Integer.parseInt(nAndk[1]);
            ArrayList<Integer> a=new ArrayList<>();
            ArrayList<Integer> b=new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(sc.nextInt());
            }
            for(int i=0;i<n;i++){
                b.add(sc.nextInt());
            }
            //System.out.println(Arrays.toString(a.toArray()));
            //System.out.println(Arrays.toString(b.toArray()));
            sc.nextLine();
            Collections.sort(a);
            b.sort(Collections.reverseOrder());
            int sum=0;
            for(int i=0;i<k;i++){
                int c=a.get(i);
                if(a.get(i)<b.get(i)){
                    a.remove(i);
                    a.add(i,b.get(i));
                    b.remove(i);
                    b.add(i,c);
                }
            }
            for(int temp: a)
                sum+=temp;
            System.out.println(sum);


        }
















    }

}



