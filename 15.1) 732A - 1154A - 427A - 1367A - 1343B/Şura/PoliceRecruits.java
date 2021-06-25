import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x=scanner.nextInt();
        int police=0;
        int answer=0;
        scanner.nextLine();
        for (int j = 0; j < x; j++) {
            int i =scanner.nextInt();
            if(i>0)
                police+=i;
            if(i<0)
                if(police!=0)
                    police+=i;
                else
                    answer-=i;
        }
        System.out.println(answer);
    }
}
