import java.util.*;

public class HolidayOfEquality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int control=0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        int max=0;
        if(n==1)
            System.out.println(0);
        else {
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                arrayList.add(k);
                if(k>max)
                    max=k;
            }
            for(int temp: arrayList){
                control+=(max-temp);
            }
            System.out.println(control);
        }














    }

}



