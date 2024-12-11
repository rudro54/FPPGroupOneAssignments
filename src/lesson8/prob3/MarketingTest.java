package lesson8.prob3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class MarketingTest {

    @Test
    public void testGettersAndSetters() {
        Marketing marketing = new Marketing("Alice", "Laptop", 1200.50);

        assertEquals("Alice", marketing.getEmployeename());
        assertEquals("Laptop", marketing.getProductname());
        assertEquals(1200.50, marketing.getSalesamount());

        marketing.setEmployeename("Bob");
        marketing.setProductname("Smartphone");
        marketing.setSalesamount(1500.75);

        assertEquals("Bob", marketing.getEmployeename());
        assertEquals("Smartphone", marketing.getProductname());
        assertEquals(1500.75, marketing.getSalesamount());
    }

    @Test
    public void testToString() {
        Marketing marketing = new Marketing("Alice", "Laptop", 1200.50);
        assertEquals("Alice Laptop 1200.5", marketing.toString());
    }

    @Test
    public void testEquals() {
        Marketing marketing1 = new Marketing("Alice", "Laptop", 1200.50);
        Marketing marketing2 = new Marketing("Alice", "Laptop", 1200.50);
        Marketing marketing3 = new Marketing("Bob", "Smartphone", 1500.75);

        assertTrue(marketing1.equals(marketing2));
        assertFalse(marketing1.equals(marketing3));
    }

    @Test
    public void testAddToList() {
        List<Marketing> marketingList = new ArrayList<>();
        Marketing m1 = new Marketing("Alice", "Laptop", 1200.50);
        marketingList.add(m1);

        assertEquals(1, marketingList.size());
        assertTrue(marketingList.contains(m1));
    }

    @Test
    public void testDeleteFromList() {
        List<Marketing> marketingList = new ArrayList<>();
        Marketing m1 = new Marketing("Alice", "Laptop", 1200.50);
        marketingList.add(m1);
        marketingList.remove(m1);

        assertEquals(0, marketingList.size());
        assertFalse(marketingList.contains(m1));
    }

    @Test
    public void testRetrieveByPosition() {
        List<Marketing> marketingList = new ArrayList<>();
        Marketing m1 = new Marketing("Alice", "Laptop", 1200.50);
        marketingList.add(m1);

        assertEquals(m1, marketingList.get(0));
    }

    @Test
    public void testUpdateByPosition() {
        List<Marketing> marketingList = new ArrayList<>();
        Marketing m1 = new Marketing("Alice", "Laptop", 1200.50);
        marketingList.add(m1);

        Marketing m2 = new Marketing("Alice", "Smartphone", 1500.75);
        marketingList.set(0, m2);

        assertEquals("Smartphone", marketingList.get(0).getProductname());
        assertEquals(1500.75, marketingList.get(0).getSalesamount());
    }

    @Test
    public void testSortBySalesAmount() {
        List<Marketing> marketingList = new ArrayList<>();
        marketingList.add(new Marketing("Charlie", "Tablet", 1100.00));
        marketingList.add(new Marketing("Alice", "Laptop", 1500.50));
        marketingList.add(new Marketing("Bob", "Smartphone", 1200.75));

        marketingList.sort(Comparator.comparingDouble(Marketing::getSalesamount));

        assertEquals("Charlie", marketingList.get(0).getEmployeename());
        assertEquals("Bob", marketingList.get(1).getEmployeename());
        assertEquals("Alice", marketingList.get(2).getEmployeename());
    }

    @Test
    public void testFilterAndSortBySalesAmount() {
        List<Marketing> marketingList = new ArrayList<>();
        marketingList.add(new Marketing("Charlie", "Tablet", 1100.00));
        marketingList.add(new Marketing("Alice", "Laptop", 1500.50));
        marketingList.add(new Marketing("Bob", "Smartphone", 1200.75));
        marketingList.add(new Marketing("David", "Monitor", 900.00));

        List<Marketing> filteredList = marketingList.stream()
                .filter(m -> m.getSalesamount() > 1000)
                .sorted(Comparator.comparing(Marketing::getEmployeename))
                .toList();

        assertEquals(3, filteredList.size());
        assertEquals("Alice", filteredList.get(0).getEmployeename());
        assertEquals("Bob", filteredList.get(1).getEmployeename());
        assertEquals("Charlie", filteredList.get(2).getEmployeename());
    }
}

