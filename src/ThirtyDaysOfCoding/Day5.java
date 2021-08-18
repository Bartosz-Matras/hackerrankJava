package ThirtyDaysOfCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine().trim());
        String[] strings = new String[T];
        for (int i = 0; i<T; i++){
            strings[i] = bufferedReader.readLine();
        }
        bufferedReader.close();
        if (1 <= T && T <=4){
            Person[] people = new Person[T];
            for (int i = 0; i<T; i++){
                if (-5 <= Integer.parseInt(strings[i]) && Integer.parseInt(strings[i]) <= 30){
                    people[i] = new Person(Integer.parseInt(strings[i]));
                }
            }
        }
    }
}

class Person{
    int age;
    Person(){

    }
    Person(int initialAge){
        if(initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }else{
            this.age = initialAge;
        }
//        this.age = Math.max(initialAge, 0);
        amIOld();
        yearPasses();
        amIOld();
        System.out.println();
    }

    void yearPasses(){
        this.age += 3;
    }

    void amIOld(){
        if (this.age < 13){
            System.out.println("You are young..");
        }else if (this.age >= 13 && this.age < 18){
            System.out.println("You are a teenager..");
        }else{
            System.out.println("You are old..");
        }
    }
}