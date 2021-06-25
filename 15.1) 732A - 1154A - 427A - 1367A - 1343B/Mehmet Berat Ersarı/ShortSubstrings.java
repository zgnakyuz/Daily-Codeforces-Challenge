import java.util.*;

public class ShortSubstrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++){
            String[] line=sc.nextLine().split("");
            ArrayList<String> arrayList=new ArrayList<>();
            for(int j=0;j<line.length;j+=2){
                if(j == line.length - 2){
                    arrayList.add(line[j]);
                    arrayList.add(line[j+1]);
                    break;
                }
                arrayList.add(line[j]);
            }
            for(String temp: arrayList)
                System.out.print(temp);
            System.out.println();


        }




    }

}



