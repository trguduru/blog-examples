package io.tguduru.mapstruct;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-07-01
 */
public class MapStructDemo {
    public static void main(String[] args) {
        CustomerSource customerSource = new CustomerSource();
        customerSource.setId(1l).setFirstName("Bob").setLastName("Smith");
        CustomerDestination customerDestination = CustomerMapper.INSTANCE.translateToDestination(customerSource);
        System.out.println(customerDestination);
    }
}
