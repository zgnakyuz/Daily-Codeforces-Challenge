import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int problems= scanner.nextInt();
        int time=scanner.nextInt();
        int totaltime=240-time;
        int totalproblems=0;
        while (true){
            totalproblems++;
            totaltime-=totalproblems*5;
            if(totaltime<0){
                totalproblems--;
                break;
            }
            if (totaltime==0){
                break;
            }
            if(totalproblems==problems){
                break;
            }
        }
        System.out.println(totalproblems);
    }
}
