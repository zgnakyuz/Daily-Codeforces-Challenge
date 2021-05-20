import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstLine= scanner.nextLine();
        String secondLine= scanner.nextLine();
        String[] splitFirst= firstLine.split(" ");
        String[] splitSecond= secondLine.split(" ");
        int kvalue= Integer.parseInt(splitSecond[Integer.parseInt(splitFirst[1])-1]);
        int print=0;
        for (String value: splitSecond) {
            if(kvalue==0){
                if(Integer.parseInt(value)>kvalue){
                    print++;
                }
            }else{
                if(Integer.parseInt(value)>=kvalue) {
                    print++;
                }
            }
        }
        System.out.println(print);
    }

}
