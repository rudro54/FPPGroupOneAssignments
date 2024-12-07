package lesson6.sort1;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        System.out.println( o1.getFname() + " " + o1.getFname().compareTo(o2.getFname()) +  " " + o2.getFname() );
        return  o1.getFname().compareTo(o2.getFname());
    }
}
