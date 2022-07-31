import java.util.Random;
import java.util.Scanner;

public class dice {

    public static void rolling() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("how many dice do you want to roll and how many sides?\n");
        int numb = myObj.nextInt();
        int dumb = myObj.nextInt();
        Random r = new Random();
        int roll = 0;
        int sum = 0;
        for (int i = 0; i < numb;   i++) {
            roll = r.nextInt(dumb) + 1;
            System.out.println(roll);
            sum = sum + roll;
        }
        System.out.println("your result is: " + sum);


    }

    public static void main(String[] args)
    {
        rolling();
    }

}

//if you were to change the bound to 12 what would happen