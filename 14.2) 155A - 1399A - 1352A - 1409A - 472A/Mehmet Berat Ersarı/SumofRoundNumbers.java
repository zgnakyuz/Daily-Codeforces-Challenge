import java.util.*;

public class SumofRoundNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            ArrayList<Integer> numbers=new ArrayList<>();
            String[] line=sc.nextLine().split("");
            int b=line.length-1;
            for(String temp: line){
                if(Integer.parseInt(temp)!=0){
                    numbers.add((int) (Integer.parseInt(temp)*(Math.pow(10,b))));
                }
                b--;
            }
            System.out.println(numbers.size());
            for(int j=0;j<numbers.size();j++ ){
                if(j==0){
                    System.out.print(numbers.get(0));
                }else
                    System.out.print(" "+numbers.get(j));
            }
            System.out.println();
        }



    }
}


