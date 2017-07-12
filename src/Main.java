import java.util.*;

public class Main
{

    public static void main(String[] args)
    {

        Scanner scnr = new Scanner(System.in);


        String name;

        int loop1 = 0;
        int loop2 = 0;
        int hereB4 = 0;
        String fin = "No";

        System.out.println("This is Lab 2.");
        System.out.print("I need your name to continue.\n Enter it here: ");
        name = scnr.nextLine();
        System.out.printf("Hello %s. I hope you're well.", name);

        do
       {
            int num;
            int pNum;
            if (hereB4 == 1)
            {
                System.out.printf("Hello again, %s. Please enter another positive whole number between 1 and 100: \n");
            }
            else
            {
                System.out.print("\nPlease enter a positive whole number between 1 and 100: ");
            }
            do
            {

                while (!scnr.hasNextInt())
                {
                    String input = scnr.next();
                    System.out.printf("1Sorry, %s, please enter a positive whole number between 1 and 100: ", name);
                }
                pNum = scnr.nextInt();

                if (pNum < 1 || pNum > 100) {
                    System.out.printf("2Sorry, %s, please enter a positive whole number between 1 and 100: ", name);
                }
                else
                {
                    loop2 = 1;
                }

            }while (loop2 == 0);
            System.out.printf("Alrighty then! %s is a good number to start with, %s!\n", pNum, name);
/*            loop1 = 1;
            System.out.println("Good so far!");
*/
            if (num % 2 == 1 && num > 60)
            {
                System.out.println("Odd and over 60.");
            }
            else if (num % 2 == 1 && num < 60)
            {
                System.out.println("Odd.");
            }
            else if (num % 2 == 0 && num >=2 && num < 25)
            {
                System.out.println("Even and less than 25.");
            }
            else if (num == 25)
            {
                System.out.print("Error in instruction logic. The number 25 is both included in specified range but not less than 25!\n Did you mean \"Even and less than 26\"?\nEnter Y or N: (");
                String chk26 = scnr.nextLine();
                chk26 = chk26.toUpperCase();
                if (chk26.equals("Y"))
                {
                    System.out.println("Ok, cool. Even and less than 26.");
                }
                else if (chk26.equals("N"))
                {
                    System.out.println("By your command.\n\n Even and less than 25.");
                }
                else
                {

                }
            }
            else if (num % 2 == 0 && num >=26 && num <= 60)
            {
                System.out.println("Even.");
            }
            if (fin.equals("no") || fin.equals("n"))
            {
                loop1 = 1;
            }
        }while (loop1 == 0);
    }
}