package lesson11.problem1.src;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass())
			return false;
		Key key = (Key) o;
		return Objects.equals(firstName, key.getFirstName()) && Objects.equals(lastName, key.getLastName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getFirstName(), getLastName());
	}

	@Override
	public String toString() {
		return "Hashcode: " + hashCode();
	}
}
