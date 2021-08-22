package Learning;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap<>();

        // Putting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sábado");
        englSpanDictionary.put("Sunday", "Domingo");

        // Retrieve things from our dicionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        // Print out all keys
        System.out.println(englSpanDictionary.keySet());

        // Print out all values
        System.out.println(englSpanDictionary.values());

        // Print out size
        System.out.println("The Size of our Dictionary is " + englSpanDictionary.size());

        System.out.println();
        System.out.println();


        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<>();
        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", Boolean.FALSE);

        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList.get("Oreos"));

        // Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());
        //Is Empty?
        System.out.println("Is Empty: " + shoppingList.isEmpty());

        shoppingList.remove("Eggs");
        System.out.println("KeySet: " + shoppingList.keySet());
        System.out.println("Values: " + shoppingList.values());

        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());
        // Clear our dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println("Is Empty: " + shoppingList.isEmpty());

    }
}
