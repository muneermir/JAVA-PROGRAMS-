import java.util.Scanner;

public class sqAC {

    public static void main(String[] arg)

    {

        Scanner s= new Scanner(System.in);
        System.out.println("ENTER the side of square");
        double a= s.nextDouble();

        double area = a*a;
        double circumfence = 2*area;
        System.out.println("THE AREA OF SQUARE IS: " +area);
        System.out.println("The CIRCUMFENCE IS : "  +circumfence);
    }
    
}
