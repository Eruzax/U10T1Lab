import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(fact(5));
        simpleRecursion(5);
        System.out.println(simpleRecursiveDivision(8));
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55

        int someNum = mystery(9, 2);
        System.out.println(someNum);

        System.out.println(bunnyEars(10));

        mystery("computers");

        System.out.println(mysteryString("xyzxyyxy"));

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));

    }

    public static int fact(int n)
    {
        int factorial = 1;
        for (int i = n; i > 0; i--)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static void simpleRecursion(int n)
    {
        System.out.println("Called, n = " + n);
        if (n > 2)
        {
            simpleRecursion(n - 1);
        }
        System.out.println("Ended, n = " + n);
    }

    public static int simpleRecursiveDivision(int num)
    {
        System.out.println("simpleRecursiveDivision called: num = " + num);
        if (num == 0)
        {
            System.out.println("Base case achieved, returning 0");
            return 0;
        }
        System.out.println("Making recursive call: " + num + " + simpleRecursiveDivision(" + num + " / 2)");
        int returnVal = num + simpleRecursiveDivision(num / 2);

        System.out.println("Returning " + returnVal);
        return returnVal;
    }

    public static int sum(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int mystery(int m, int n)
    {
        if (m <= 0)
        {
            return n; // BASE CASE (doesn't involve a recursive call)
        }
        return n * mystery(m - 2, n + 1);
    }

    public static int bunnyEars(int bunnies)
    {
        if (bunnies > 5)
        {
            return 2 + bunnyEars(bunnies - 1);
        }
        else if (bunnies > 0)
        {
            return 3 + bunnyEars(bunnies - 2);
        }
        else
        {
            return 4;  // BASE CASE (doesn't involve a recursive call)
        }
    }

    public static void mystery(String s)
    {
        if (s.length() > 1)
        {
            mystery(s.substring(2));
            System.out.print(s.substring(0, 1));
        }
        // BASE CASE IS IMPLICIT: no recursive call if length <= 1
    }

    public static int mysteryString(String str)
    {
        if (str.length() == 1) // BASE CASE
        {
            if (str.equals("y"))
            {
                return 2; // doesn't involve a recursive call
            }
            else
            {
                return 0; // doesn't involve a recursive call
            }
        }
        else
        {
            if (str.substring(0, 1).equals("y"))
            {
                return 2 + mysteryString(str.substring(1));
            }
            else
            {
                return mysteryString(str.substring(1));
            }
        }
    }

    public static String countdown(int number)
    {
        if (number == 0)
        {
            return ("Blast Off!");
        }
        countdown(number - 1);
        return number + " " + countdown(number - 1);
    }

}
