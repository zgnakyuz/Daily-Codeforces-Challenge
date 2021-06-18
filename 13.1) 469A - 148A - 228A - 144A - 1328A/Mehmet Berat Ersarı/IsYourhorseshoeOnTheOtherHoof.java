import java.util.*;

public class IsYourhorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> berat=new ArrayList<>();
        int sum=0;
        berat.add(sc.nextInt());
        berat.add(sc.nextInt());
        berat.add(sc.nextInt());
        berat.add(sc.nextInt());
        Collections.sort(berat);
        for(int i=0;i<3;i++){
            if(berat.get(i).equals(berat.get(i + 1)))
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

