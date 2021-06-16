import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int counter=0;
        for(int i=0; i<n;i++){
            int b=sc.nextInt();
            int max=sc.nextInt();
            if(max-b>1)
                counter++;
        }
        System.out.println(counter);

    }
}
