import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int queuelong=scanner.nextInt();
        int letting=scanner.nextInt();
        scanner.nextLine();
        String queue=scanner.nextLine();
        String[] split=queue.split("");
        for (int j = 0; j < letting; j++) {
            for (int i = 0; i < queuelong; i++) {
                if(split[i].equals("B")){
                    if(i+1<queuelong){
                        if(split[i+1].equals("G")){
                            split[i]="G";
                            split[i+1]="B";
                            i++;
                        }
                    }
                }
            }
        }
        String last="";
        for (String s:split) {
            last+=s;
        }
        System.out.println(last);
    }
}
