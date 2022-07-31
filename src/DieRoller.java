import java.util.Random;
import java.util.Scanner;


public class DieRoller
{
    public static void diceRoll()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("how many dice do you want to roll?\n");
        int numb = myObj.nextInt();
        Random r = new Random();
        int roll=0;
        int sum=0;
        for (int i=0; i < numb; i++)
        {
            roll = r.nextInt(6)+1;
            System.out.println(roll);
            sum = sum + roll;
        }
        System.out.println("your result is: " + sum);
    }

    public static void main(String[] args)
    {
        diceRoll();

    }
}

