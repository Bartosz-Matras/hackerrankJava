package ThirtyDaysOfCoding;

import java.util.Scanner;

public class Day20 implements AdvancedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        Day20 day20 = new Day20();

//        System.out.println("I implemented: " + "");
        printInterfaceNames(day20);
        int result = day20.divisionSum(n);
        System.out.println(result);
    }

    static void printInterfaceNames(Object o){
        Class c = o.getClass();
        Class[] theInterfaces = c.getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println("I implemented: " + interfaceName);
        }
    }


    @Override
    public int divisionSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}

interface AdvancedArithmetic {

    int divisionSum(int n);
}