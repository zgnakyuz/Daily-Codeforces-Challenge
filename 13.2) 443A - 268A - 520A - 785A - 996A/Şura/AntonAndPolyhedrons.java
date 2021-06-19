import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();scanner.nextLine();
        int total=0;
        for (int i = 0; i < len; i++) {
            String line=scanner.nextLine();
            if(line.equals("Tetrahedron"))
                total+=4;
            else if(line.equals("Cube"))
                total+=6;
            else if(line.equals("Octahedron"))
                total+=8;
            else if(line.equals("Dodecahedron"))
                total+=12;
            else if(line.equals("Icosahedron"))
                total+=20;
        }
        System.out.println(total);

    }

}
