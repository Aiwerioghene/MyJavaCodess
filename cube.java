import java.util.Scanner;

//return statement practice
public class cube
{
    public static int cubea()
    {
        int a, cube;// initializing variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        a = sc.nextInt();
        return a * a * a;

    }
    public static void main(String[]args)
    {
        System.out.println("The cube of the value is" + cubea());
    }
}

// when using return statemet yo dont include void
//rather you put the data type(int, double etc)