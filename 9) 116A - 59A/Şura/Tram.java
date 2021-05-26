import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        scanner.nextLine();
        int maxCapacity=0;
        int current=0;
        for (int i = 0; i <first ; i++) {
            int exit=scanner.nextInt();
            int enter=scanner.nextInt();
            current-=exit;
            current+=enter;
            if(current>maxCapacity){
                maxCapacity=current;
            }
            scanner.nextLine();
        }
        System.out.println(maxCapacity);
    }
}
