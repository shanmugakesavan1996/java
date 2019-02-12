import java.util.Scanner;
public class leap year{

    public static void main(String[] args) {

        int year;
        boolean leap = false;
        System.out.println("enter the year:");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}