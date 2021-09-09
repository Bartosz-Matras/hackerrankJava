package ThirtyDaysOfCoding;


import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();

        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();

        scanner.close();

        int fine;

        if (actualYear > expectedYear){
            fine = 10000;
        }else if (actualMonth > expectedMonth && (actualYear >= expectedYear)){
            fine = 500 * (actualMonth - expectedMonth);
        }else if(actualDay > expectedDay && (actualMonth >= expectedMonth) && (actualYear >= expectedYear)){
            fine = 15 * (actualDay - expectedDay);
        }else{
            fine = 0;
        }
        System.out.println(fine);
    }
}
