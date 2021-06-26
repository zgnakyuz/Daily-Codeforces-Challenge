import java.util.*;

public class TeamOlympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> ones= new Stack<>();
        Stack<Integer> twos= new Stack<>();
        Stack<Integer> threes= new Stack<>();

        int n=sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            int curr=sc.nextInt();
            if(curr==1)
                ones.push(i);
            else if(curr==2)
                twos.push(i);
            else
                threes.push(i);
        }

        int min=Math.min(Math.min(ones.size(),twos.size()),threes.size());
        System.out.println(min);
        while(min--!=0){
            System.out.println(ones.pop()+" "+twos.pop()+" "+threes.pop());

        }
















    }

}



