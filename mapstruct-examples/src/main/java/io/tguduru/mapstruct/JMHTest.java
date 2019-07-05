package io.tguduru.mapstruct;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-07-01
 */
public class JMHTest {

    public void translate() {
        CustomerSource customerSource = new CustomerSource();
        customerSource.setId(1l).setFirstName("Bob").setLastName("Smith");
        CustomerDestination customerDestination = CustomerMapper.INSTANCE.translateToDestination(customerSource);
    }
}
