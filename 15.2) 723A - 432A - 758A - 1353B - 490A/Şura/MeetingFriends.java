import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] friends=new int[3];
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        friends[0]=x;
        friends[1]=y;
        friends[2]=z;
        int max=0;
        int min=101;
        int indexmax=0;
        int indexmin=0;
        for (int i = 0; i < 3; i++) {
            if (friends[i] > max) {
                max=friends[i];
                indexmax = i;
            }
            if (friends[i] < min) {
                min=friends[i];
                indexmin = i;
            }
        }
        /*int orta=0;
        for (int i = 0; i < 3; i++) {
            if(i!= indexmax&& i!=indexmin){
                orta=i;
            }
        }*/
        System.out.println(max-min);
    }

}
