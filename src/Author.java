public class Author {
    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author1 = (Author) other;
        return firstName.equals(author1.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }

    @Override
    public String toString() {
        return "Имя автора: " + firstName + ". Фамилия автора: " + lastName + ".";
    }
}
