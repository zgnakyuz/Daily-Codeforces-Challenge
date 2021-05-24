import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] strList= input.split("\\+");
        ArrayList<Integer> intList=new ArrayList<>();
        for (String temp: strList){
            int a= Integer.parseInt(temp);
            intList.add(a);
        }
        Collections.sort(intList);
        for(int i=0; i< intList.size();i++){
            if(intList.size()==1){
                System.out.println(intList.get(i));
                break;
            }
            if(i==intList.size()-1){
                System.out.println(intList.get(i));
                break;
            }

            System.out.print(intList.get(i));
            System.out.print("+");
        }
    }
}
