package io.tguduru.mapstruct;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-07-01
 */
public class CustomerDestination {
    private long id;
    private String firstName;
    private String lastName;

    public long getId() {
        return id;
    }

    public CustomerDestination setId(final long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerDestination setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerDestination setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerDestination{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
