import java.util.*;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> numberS= new ArrayList<>();
        for(int i=0;i<n;i++){
            numberS.add(sc.nextInt());
        }
        int min=numberS.get(0);
        int max=numberS.get(0);
        int counter1=0;
        int counter2=0;
        for(Integer temp: numberS){
            if(temp>max){
                max=temp;
            }if(temp<min){
                min=temp;
            }
        }
        for(int i=0; i<n;i++){
            if(numberS.get(i)==max){
                numberS.remove(i);
                numberS.add(0,max);
                break;
            }
            counter1++;
        }
        //System.out.println(Arrays.deepToString(numberS.toArray()));
        for(int i=n-1; i>-1;i--){
            if(numberS.get(i)==min){
                numberS.remove(i);
                numberS.add(n-1,min);
                break;
            }
            counter2++;
        }
        //System.out.println(counter1);
        System.out.println(counter1+counter2);
    }
}

