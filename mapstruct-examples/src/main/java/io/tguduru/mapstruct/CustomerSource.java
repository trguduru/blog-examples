package io.tguduru.mapstruct;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-06-30
 */
public class CustomerSource {
    private long id;
    private String firstName;
    private String lastName;

    public long getId() {
        return id;
    }

    public CustomerSource setId(final long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerSource setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerSource setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerSource{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
