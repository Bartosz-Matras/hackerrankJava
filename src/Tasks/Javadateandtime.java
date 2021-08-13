package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Javadateandtime {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMutlipleInput = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        int month = Integer.parseInt(firstMutlipleInput[0]);
        int day = Integer.parseInt(firstMutlipleInput[1]);
        int year = Integer.parseInt(firstMutlipleInput[2]);

        LocalDate localDate = LocalDate.of(year, month, day);
        if(2000 < year && year < 3000){
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            System.out.println(dayOfWeek.toString());
        }
    }
}
