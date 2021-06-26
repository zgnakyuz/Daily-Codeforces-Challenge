import java.util.*;

public class TheNewYearMeetingFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        int max =a;
        int min=a;
        for(int temp: arrayList){
            if(temp>max)
                max=temp;
            if(temp<min)
                min=temp;

        }
        int control=0;
        for(int temp: arrayList)
            if(temp!=max || temp!=min)
                control=temp;

        System.out.println((max-control)+(control-min));










    }

}



