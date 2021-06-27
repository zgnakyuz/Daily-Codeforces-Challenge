import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();scanner.nextLine();
        HashMap<Integer,Integer> input=new HashMap<>();
        int ones=0;
        int twos=0;
        int threes=0;
        for (int i = 1; i <= len; i++) {
            int x=scanner.nextInt();
            if(x==1){
                ones++;
            }
            if(x==2){
                twos++;
            }
            if(x==3){
                threes++;
            }
            input.put(i,x);
        }
        List<Integer> t=Arrays.asList(ones,twos,threes);
        Integer min= Collections.min(t);
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            int r=1;
            for (int k = 1; k <= 3; k++) {
                for (int j = 1; j <= len; j++) {
                    if(input.get(j)==k){
                        System.out.print(j+" ");
                        input.put(j,-1);
                        break;
                    }

                }
            }
            System.out.println();
        }
    }
}
