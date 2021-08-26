package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day13 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> listOfScores = new ArrayList<>();

        String[] scores = bufferedReader.readLine().split(" ");

        for (int i = 0; i < n; i++){
            int s = Integer.parseInt(scores[i]);
            if (0 <= s && s <= 100){
                listOfScores.add(Integer.parseInt(scores[i]));
            }
        }
        bufferedReader.close();

        Student student = new Student(strings[0], strings[1], Integer.parseInt(strings[2]), listOfScores);

        if (1 <= student.getFirstName().length() && 1 <= student.getLastName().length()
                && student.getFirstName().length() <= 10 && student.getLastName().length() <= 10){
            System.out.println("Name: " + student.getFirstName() + ", " + student.getLastName());
            System.out.println("ID: " + student.getIdNumber());
            System.out.println("Grade: " + student.calculate());
        }

    }
}

class Person1{
    String firstName;
    String lastName;
    int idNumber;
    List<Integer> scores;

    Person1(){

    }

    Person1(String firstName, String lastName, int idNumber, List<Integer> scores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.scores = scores;
    }
}


class Student extends Person1{
    String firstName;
    String lastName;
    int idNumber;
    List<Integer> scores;

    Student(String firstName, String lastName, int idNumber, List<Integer> scores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.scores = scores;
    }

    char calculate(){

        int sum = 0;
        for (Integer i : this.getScores()){
            sum += i;
        }
        sum = sum / this.getScores().size();
        if (90 <= sum && sum <= 100){
            return 'O';
        }else if (80 <= sum && sum < 90) {
            return 'E';
        }else if (70 <= sum && sum < 80){
            return 'A';
        }else if (55 <= sum && sum < 70){
            return 'P';
        }else if (40 <= sum && sum < 55){
            return 'D';
        }else{
            return 'T';
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public List<Integer> getScores() {
        return this.scores;
    }
}