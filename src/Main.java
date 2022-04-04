public class Main
{
    public static void main(String[] args)
    {
        System.out.println(fact(5));
        simpleRecursion(5);
        System.out.println(simpleRecursiveDivision(8));
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55

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

}
