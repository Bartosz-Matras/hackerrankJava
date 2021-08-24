package Learning;

public class Recursion {

    public static int summation(int n){
        // Base Case: WE ARE AT THE END
        if (n <= 0){
            return 0;
        }else { // Recursive Case: KEEP GOING
            return n + summation(n-1);
        }
    }

    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static int exponentiation(int base, int n){
        if (n <= 0){
            return 1;
        }else{
            return base * exponentiation(base, n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summation(5));
        System.out.println(factorial(5));
        System.out.println(exponentiation(5,3));
    }
}
