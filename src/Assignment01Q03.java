public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int f1 = 1, f2 = 1, tmp = 1;
        System.out.print(1 + " " + 1 + " ");
        int numOdd = 2;
        for (int i = 2; i < x; i++) {
            tmp = f2;            
            f2 = f1 + f2;
            f1 = tmp;
            System.out.print(f2);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            if (f2 % 2 == 1)
                ++numOdd;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
