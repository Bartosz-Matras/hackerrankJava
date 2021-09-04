package ThirtyDaysOfCoding;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for(int i = 0; i < n; i++){
            intArray[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        String[] stringArray = new String[n2];
        for (int i = 0; i < n2; i++){
            stringArray[i] = scanner.nextLine();
        }

        Printer.printArray(intArray);
        Printer.printArray(stringArray);

        scanner.close();
    }
}

class Printer<E>{
    public static <E> void printArray(E[] generic){
        for(E element : generic) {
            System.out.println(element);
        }
    }
}