package Tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class printLinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        for (int i = 0; i < n; i++){
            integerLinkedList.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        bufferedReader.close();

        for (int i : integerLinkedList){
            System.out.println(i);
        }

    }
}

