import java.util.Objects;

public class FullName {
    private String firstName;
    private String middleName;
    private String lastName;

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

    @Override
    public boolean equals(Object otherFullName) {
        if (otherFullName == null || getClass() != otherFullName.getClass()) return false;
        FullName fullName = (FullName) otherFullName;
        return Objects.equals(firstName, fullName.firstName) && Objects.equals(middleName, fullName.middleName) && Objects.equals(lastName, fullName.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }
}
