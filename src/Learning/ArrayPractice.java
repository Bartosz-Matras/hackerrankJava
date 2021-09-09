package Learning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

//    public static void printArray(int[] array){
//        System.out.print("[");
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i]);
//            if (i < array.length - 1){
//                System.out.print(", ");
//            }
//        }
//        System.out.print("]");
//        System.out.println();
//    }

    public static <E> void printArray(E[] array){
        for (E element : array){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        Integer[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        // Print out Arrays
//        System.out.println(Arrays.toString(intArray1)); // Variable "intArray1" might not have been initialized
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        System.out.println(Arrays.toString(intArray2));
        System.out.println();

        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // Retrieve object
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 2));
        System.out.println();

        // Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        System.out.println();

        // Special for loop : foreach
        for (String s : shoppingList){
            System.out.println(s);
        }
    }
}
