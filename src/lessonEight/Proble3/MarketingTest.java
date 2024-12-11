package lessonEight.Proble3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MarketingTest {
    public static void main(String[] args) {
        // Step a: Create an ArrayList<Marketing>
        List<Marketing> marketingList = new ArrayList<>();

        // Step b: Add minimum 5 objects
        marketingList.add(new Marketing("Alice", "Laptop", 1500.0));
        marketingList.add(new Marketing("Bob", "Tablet", 800.0));
        marketingList.add(new Marketing("Charlie", "Smartphone", 2000.0));
        marketingList.add(new Marketing("Diana", "Camera", 1200.0));
        marketingList.add(new Marketing("Eve", "Headphones", 900.0));

        // Step c: Delete an object by passing an instance
        marketingList.remove(new Marketing("Bob", "Tablet", 800.0));

        // Step d: Print the size of the list
        System.out.println("Size of the list: " + marketingList.size());

        // Step e: Retrieve an object by its position
        Marketing retrieved = marketingList.get(1);
        System.out.println("Retrieved object: " + retrieved);

        // Step f: Update the details of a Marketing object by position
        marketingList.set(1, new Marketing("Charlie", "Smartwatch", 2500.0));
        System.out.println("Updated list: " + marketingList);

        // Step g: Sort the list by salesAmount using a comparator
        marketingList.sort(Comparator.comparingDouble(Marketing::getSalesAmount));
        System.out.println("Sorted by salesAmount: " + marketingList);

        // Step h: Filter and sort by employeeName with salesAmount > 1000
        List<Marketing> filteredList = listMoreThan1000(marketingList);
        filteredList.sort(Comparator.comparing(Marketing::getEmployeeName));
        System.out.println("Filtered and sorted list: " + filteredList);
    }

    // Step i: Method to retrieve employees with salesAmount > 1000
    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }
}

