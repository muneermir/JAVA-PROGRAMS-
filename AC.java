import java.util.Scanner;
public class AC 
{

    public static void main (String[] args)
    {
     int r;
     double  pi=3.14,area;
        System.out.println("Enter radius of circle");
        Scanner s=new Scanner (System.in);
        r =s.nextInt();
        area=pi*r*r;
        System.out.println("Area of circle is "  + area);
        s.close();
    }}