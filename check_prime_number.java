public class check_prime_number {
    public static void main(String [] args)
    {
        int a = 1 ;
        int i;
        int count = 0;
        for (i=a-1;i>1;i--)
        {
            if(a%i==0)
            {
                count++;
            }
        }

        if (count==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Composite Number");
        }
    }
}
