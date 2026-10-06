import java.util.Scanner;

public class TheaterKiosk
{
    void main()
    {
        Scanner in = new Scanner(System.in);

        int age = 0;
        final int AGE_CUT_OFF = 21;
        String trash = "";

        IO.print("Enter your age, must be 21 to see this film!: ");
        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();

            if (age >= AGE_CUT_OFF)
            {
                IO.print("You get a wrist band!");
            }
            else
            {
                IO.print("You are too young for this film!");
            }
        }
        else
        {
            trash = in.nextLine();
            IO.println("You must enter a valid age not: " + trash);
        }
    }
}
