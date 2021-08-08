package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaloopsII {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of queries: ");
        String inp = bufferedReader.readLine();
        int q = Integer.parseInt(inp);

        if (0 <= q && q <= 500){
            for (int i = 0; i < q; i++){
                String[] input = new String[3];
                int a, b, n;
                input = bufferedReader.readLine().split(" ");
                a = Integer.parseInt(input[0]);
                b = Integer.parseInt(input[1]);
                n = Integer.parseInt(input[2]);
//                System.out.print("Enter a: ");
//                int a = scanner.nextInt();
//
//                System.out.print("Enter b: ");
//                int b = scanner.nextInt();
//
//                System.out.print("Enter n: ");
//                int n = scanner.nextInt();

                if ((0 <= a && a <= 50) && (0 <= b && b <= 50) && (1 <= n && n <= 15)){
                    int[] tab = new int[n];
                    for (int j = 0; j < tab.length; j++){
                        int suma = a;

                        for (int k = 0; k<=j; k++){
                            suma += (Math.pow(2, k) * b);
                        }
                        tab[j] = suma;
                    }
                    for (int z : tab){
                        System.out.print(z + " ");
                    }
                    System.out.println();
                }
                else
                    System.out.println("Incorrect argument");
            }
        }
    }
}
