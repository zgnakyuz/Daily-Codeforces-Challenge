import java.util.Locale;
import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner lines = new Scanner(System.in);
        String line = lines.next();
        String line2 = lines.next();
        String upperline = line.toUpperCase();
        String upperline2 = line2.toUpperCase();
        if (upperline.equals(upperline2))
            System.out.println("0");
        else if (upperline.compareTo(upperline2) > 0)
            System.out.println("1");
        else
            System.out.println("-1");
    }
    }

