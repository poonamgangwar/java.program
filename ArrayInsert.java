import java.util.ArrayList;
import java.util.List;

public class ArrayInsert {

    public static void main(String[] args) {
        // Initialize the list with the given elements
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(7);
        array.add(9);
        array.add(4);

        // Insert the element 5 at the 2nd index (which is the 3rd position in the list)
        array.add(2, 5);

        // Remove the last element to get the desired output
        array.remove(array.size() - 1);

        // Print the modified list
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
