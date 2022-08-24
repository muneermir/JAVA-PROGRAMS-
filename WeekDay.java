import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Monday,2 for Tuesday,3 for Wednesday,4 for Thursday,5 for Friday ,6 for Saturday and 7 for Saturday");
        day= sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
