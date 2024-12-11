package lesson8.prob1;

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] personArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		personArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// 1. Implement method to Add as last element, make sure you have enough room else call resize()
	public void add(Person s) {
		if(s == null)
			return;
		if(size == personArray.length)
			resize();
		if(personArray.length > size)
			personArray[size++] = s;
	}

	// 2. get person information by passing index
	public Person get(int i) {
		if(i < 0 || i >= size)
			return null;
		return personArray[i];
	}

	// 3. Find the Person object using lastname
	public boolean find(String lastName) {
		if(lastName == null)
			return false;
		for(Person p : personArray)
			if(lastName.equals(p.getLast()))
				return true;
		return false;
	}
 
  	// 4. Remove the person object by passing its lastname
	public boolean remove(String lastName) {
		if(lastName == null || lastName.isEmpty())
			return false;
		for(int i = 0; i < size; i++)
			if(lastName.equals(personArray[i].getLast())) {
				for(int j = i+1; j < size; j++)
					personArray[j-1] = personArray[j];
				size--;
				return true;
			}
        return false;
	}
  	// 5. Resizing the list
	private void resize() {
		Person[] newArray = new Person[personArray.length+INITIAL_LENGTH];
		int index = 0;
		for(Person p : personArray)
			newArray[index++] = p;
		personArray = newArray;
	}
   // To display all the persons list
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(personArray[i] + ", \n");
		}
		sb.append(personArray[size - 1] + "]");
		return sb.toString();
	}
   // Return the size
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Bruce", "Tom", 36));
		list.add(new Person("Paul", "Corozza", 51));
		list.add(new Person("Joe", "Lermon", 53));
		list.add(new Person("Anne", "Dow", 55));
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		list.remove("Tom");
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		System.out.println("\nSearching of Lermon: " + list.find("Lermon"));
		System.out.println(list.get(2));
	}
}