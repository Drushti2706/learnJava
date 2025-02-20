import java.util.HashMap;
import java.util.Scanner;

public class HashingExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<Integer, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Insert values into the HashMap (Hashing)
        map.put(1, "Drushti");
        map.put(2, "Urvish");
        map.put(3, "kismis");
        map.put(4, "Pushpa");
        map.put(5, "Payal");

        System.out.println("HashMap (Key-Value Pairs): " + map);

        // Search for a key in the HashMap
        System.out.print("\nEnter a key to search: ");
        int key = scanner.nextInt();
        if (map.containsKey(key)) {
            System.out.println("Key " + key + " found! Value: " + map.get(key));
        } else {
            System.out.println("Key " + key + " not found.");
        }

        // Delete a key from HashMap
        System.out.print("\nEnter a key to remove: ");
        int removeKey = scanner.nextInt();
        if (map.containsKey(removeKey)) {
            map.remove(removeKey);
            System.out.println("Key " + removeKey + " removed.");
        } else {
            System.out.println("Key " + removeKey + " not found.");
        }

        // Display updated HashMap
        System.out.println("\nUpdated HashMap: " + map);
        
        scanner.close();
    }
}
