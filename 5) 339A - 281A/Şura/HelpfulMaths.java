import java.util.ArrayList;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        String[] split=input.split("\\+");
        ArrayList<Integer> integers=new ArrayList<>();
        for (String s:split) {
            integers.add(Integer.parseInt(s));
        }
        integers.sort(Integer::compareTo);
        StringBuilder output= new StringBuilder();
        for (Integer i:integers) {
            output.append(i);
            output.append("+");
        }
        System.out.println(output.substring(0,output.length()-1));
    }
}
