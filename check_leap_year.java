public class check_leap_year {
    public static void main(String [] args)
    {
        int year = 2021;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}
