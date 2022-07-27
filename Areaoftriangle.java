import java.util.Scanner;



public class Areaoftriangle {

    public static void main (String args [])
    {

    Scanner s =new Scanner(System.in);
    System.out.println("Enter the width of triangle");
    double b=s.nextDouble();
    System.out.print(" Enter the height of triangle");
    double h=s.nextDouble();

    double area =(b*h)/2;
    System.out.println(" Area of triangle is :" +area);
    s.close();


    }
}
