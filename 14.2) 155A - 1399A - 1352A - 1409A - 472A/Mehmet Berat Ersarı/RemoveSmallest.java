import java.util.*;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            ArrayList<Integer> numbers=new ArrayList<>();
            for(int j=0;j<a;j++){
                numbers.add(sc.nextInt());
            }
           Collections.sort(numbers);
            if(numbers.size()==1){
                System.out.println("YES");
            }else {
                for (int j = 0; j < a - 1; j++) {
                    if (Math.abs(numbers.get(j) - numbers.get(j + 1)) <= 1) {
                        if (j == a - 2)
                            System.out.println("YES");
                        continue;
                    } else {
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }



    }
}


