package lesson8.prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Marketing> list = new ArrayList<Marketing>();
        list.add(new Marketing("Charlie", "Tablet", 1200));
        list.add(new Marketing("Bob", "Phone", 800));
        list.add(new Marketing("Alice", "Laptop", 1200));
        list.add(new Marketing("David", "Monitor", 700));
        list.add(new Marketing("Eve", "Keyboard", 1100));

        Marketing itemToRemove = list.get(1);
        list.remove(itemToRemove);

        System.out.println("List: " + list);
        System.out.println("List Size: " + list.size());

        System.out.println("Marketing object at index 2 is: " + list.get(2));
        list.set(2, new Marketing("David Jones", "Display", 750));
        System.out.println("Marketing object at index 2 after update: " + list.get(2));

        System.out.println("List before sort: " + list);
        list.sort((Marketing a, Marketing b) -> a.getSalesamount() < b.getSalesamount() ? -1 : 1);
        System.out.println("List after sort: " + list);

        System.out.println("More than 1000 sales sorted list: " + listMoreThan1000(list));
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        if (list == null || list.isEmpty()) return list;
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list)
            if (marketing.getSalesamount() > 1000)
                result.add(marketing);
        result.sort((Marketing a, Marketing b) -> a.getSalesamount() < b.getSalesamount() ? -1 : 1);
        return result;
    }
}
